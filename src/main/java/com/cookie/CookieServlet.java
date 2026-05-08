package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie cookies[] = request.getCookies();

        // Read existing cookies
        if (cookies != null) {

            for (Cookie c : cookies) {

                if (c.getName().equals("visit")) {

                    visitCount =
                            Integer.parseInt(c.getValue());

                    visitCount++;
                }

                if (c.getName().equals("user")) {

                    name = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie userCookie =
                new Cookie("user", name);

        Cookie visitCookie =
                new Cookie("visit",
                        String.valueOf(visitCount));

        // Cookie expiry time = 30 seconds
        userCookie.setMaxAge(30);
        visitCookie.setMaxAge(30);

        // Add cookies
        response.addCookie(userCookie);
        response.addCookie(visitCookie);

        // Display output
        out.println("<html><body>");

        out.println("<h2>Welcome back "
                + name + " !</h2>");

        out.println("<h3>You have visited this page "
                + visitCount + " times.</h3>");

        out.println("<p>Cookie expires in 30 seconds.</p>");

        out.println("</body></html>");
    }
}