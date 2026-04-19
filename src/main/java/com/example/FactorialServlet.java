package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input from HTML form
        int num = Integer.parseInt(request.getParameter("num"));

        long fact = 1;

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // Output result
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>Number: " + num + "</p>");
        out.println("<p>Factorial: " + fact + "</p>");
    }
}