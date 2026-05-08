package com.checker.app;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int n = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        // Prime Logic: A number > 1 with no divisors other than 1 and itself
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        out.println("<html><body>");
        if (isPrime) {
            out.println("<h2 style='color:green;'>" + n + " is a Prime Number!</h2>");
        } else {
            out.println("<h2 style='color:red;'>" + n + " is NOT a Prime Number.</h2>");
        }
        out.println("<br><a href='index.html'>Check another number</a>");
        out.println("</body></html>");
    }
}