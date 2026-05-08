package com.user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")

public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String username =
                request.getParameter("username");

        String email =
                request.getParameter("email");

        String designation =
                request.getParameter("designation");

        // Server-side validation
        if(username == null || username.trim().equals("")
                || email == null || !email.contains("@")
                || designation == null
                || designation.trim().equals(""))
        {
            response.setContentType("text/html");

            PrintWriter out =
                    response.getWriter();

            out.println("<h2>Server Side Validation Failed!</h2>");

            out.println("<a href='index.jsp'>");
            out.println("Go Back");
            out.println("</a>");

            return;
        }

        // Store values
        request.setAttribute("username", username);

        request.setAttribute("email", email);

        request.setAttribute("designation",
                             designation);

        // Forward to JSP
        RequestDispatcher rd =
                request.getRequestDispatcher("result.jsp");

        rd.forward(request, response);
    }
}