package com.session;

import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionServlet")

public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name =
                request.getParameter("username");

        // Create session
        HttpSession session =
                request.getSession();

        // Set session expiry time = 1 minute
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount =
                (Integer)session.getAttribute("count");

        if(visitCount == null)
        {
            visitCount = 1;
        }
        else
        {
            visitCount++;
        }

        // Store visit count
        session.setAttribute("count", visitCount);

        // Store username
        session.setAttribute("uname", name);

        // Session information
        String sessionId = session.getId();

        Date creationTime =
                new Date(session.getCreationTime());

        Date lastAccessTime =
                new Date(session.getLastAccessedTime());

        // Display output
        out.println("<html><body>");

        out.println("<h2>Hello "
                + name + " !</h2>");

        out.println("<h3>Session Tracking Information</h3>");

        out.println("<table border='1' cellpadding='10'>");

        out.println("<tr>");
        out.println("<th>Information</th>");
        out.println("<th>Value</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Session ID</td>");
        out.println("<td>" + sessionId + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Session Creation Time</td>");
        out.println("<td>" + creationTime + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Last Access Time</td>");
        out.println("<td>" + lastAccessTime + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Visit Count</td>");
        out.println("<td>" + visitCount + "</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("<p>");
        out.println("Session expires in 1 minute.");
        out.println("</p>");

        out.println("</body></html>");
    }
}