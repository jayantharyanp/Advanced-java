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

        String name =
                request.getParameter("username");

        int visitCount = 1;

        Cookie cookies[] = request.getCookies();

        // Read existing cookies
        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                // Visit cookie
                if(c.getName().equals("visit"))
                {
                    visitCount =
                        Integer.parseInt(c.getValue());

                    visitCount++;
                }

                // Username cookie
                if(c.getName().equals("user"))
                {
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

        // Set cookie expiry to 30 seconds
        userCookie.setMaxAge(30);
        visitCookie.setMaxAge(30);

        // Add cookies
        response.addCookie(userCookie);
        response.addCookie(visitCookie);

        // Display response
        out.println("<html><body>");

        out.println("<h2>Welcome back "
                + name + " !</h2>");

        out.println("<h3>You have visited this page "
                + visitCount + " times.</h3>");

        out.println("<p>Cookie expires in 30 seconds.</p>");

        // Display cookie list and set values
        out.println("<h3>Cookie List and Set Values</h3>");

        Cookie allCookies[] =
                request.getCookies();

        if(allCookies != null)
        {
            out.println("<table border='1' cellpadding='10'>");

            out.println("<tr>");
            out.println("<th>Cookie Name</th>");
            out.println("<th>Set Value</th>");
            out.println("</tr>");

            for(Cookie c : allCookies)
            {
                out.println("<tr>");

                out.println("<td>"
                        + c.getName()
                        + "</td>");

                out.println("<td>"
                        + c.getValue()
                        + "</td>");

                out.println("</tr>");
            }

            out.println("</table>");
        }
        else
        {
            out.println("<h3>No Cookies Found!</h3>");
        }

        out.println("</body></html>");
    }
}