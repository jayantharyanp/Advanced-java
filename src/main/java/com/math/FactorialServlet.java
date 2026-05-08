package com.math;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Mapping the servlet to a URL
@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set the response type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Step 1: Read the input 'num' from the HTML form
        String input = request.getParameter("num");
        int n = Integer.parseInt(input);
        
        // Step 2: Factorial Logic
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        // Step 3: Send the result back to the browser
        out.println("<html><body>");
        out.println("<h3>Result: The factorial of " + n + " is " + factorial + "</h3>");
        out.println("<a href='index.html'>Calculate another number</a>");
        out.println("</body></html>");
    }
}