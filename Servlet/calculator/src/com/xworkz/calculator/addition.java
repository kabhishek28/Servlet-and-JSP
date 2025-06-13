package com.xworkz.calculator;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns="/add", loadOnStartup=1)
public class addition extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String num1 = servletRequest.getParameter("number1");
        String num2 = servletRequest.getParameter("number2");

        Integer n1 = Integer.valueOf(num1);
        Integer n2 = Integer.valueOf(num2);

        int res = n1 + n2;
        PrintWriter pc = servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        pc.println("<h1>Addition result</h1><h3>"+res+"</h3>");
    }
}