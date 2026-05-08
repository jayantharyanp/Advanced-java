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

        // Read cookies
        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                // Visit counter
                if(c.getName().equals("visit"))
                {
                    visitCount =
                        Integer.parseInt(c.getValue());

                    visitCount++;
                }

                // Username
                if(c.getName().equals("user"))
                {
                    name = c.getValue();
                }
            }
        }

        // Create username cookie
        Cookie userCookie =
                new Cookie("user", name);

        // Create visit cookie
        Cookie visitCookie =
                new Cookie("visit",
                        String.valueOf(visitCount));

        // Cookie expiry = 30 seconds
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

        // Display cookie list
        out.println("<h3>Active Cookie List</h3>");

        Cookie allCookies[] =
                request.getCookies();

        if(allCookies != null)
        {
            out.println("<table border='1' cellpadding='10'>");

            out.println("<tr>");
            out.println("<th>Cookie Name</th>");
            out.println("<th>Cookie Value</th>");
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
            out.println("<p>No Cookies Found!</p>");
        }

        out.println("</body></html>");
    }
}