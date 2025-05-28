package com.xworkz.calculator;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/multi",loadOnStartup = 1)
public class multiplication extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String num1 = servletRequest.getParameter("number1");
        String num2 = servletRequest.getParameter("number2");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int res = n1 * n2;

        PrintWriter writer = servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        writer.println("<h1>multiplication result</h1><h3>"+res+"</h3>");
    }
}
