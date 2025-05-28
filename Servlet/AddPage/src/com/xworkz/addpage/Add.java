package com.xworkz.addpage;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/add" , loadOnStartup = 1)
public class Add extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        int num1 = Integer.parseInt(servletRequest.getParameter("num1"));
        int num2 = Integer.parseInt(servletRequest.getParameter("num2"));

        int res = num1 + num2;

        PrintWriter out = servletResponse.getWriter();
        out.println("<html><body><h1>"+"output :"+res+"<h1></body></html>");
    }
}
