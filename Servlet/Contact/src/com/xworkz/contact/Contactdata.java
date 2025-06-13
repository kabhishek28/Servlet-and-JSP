package com.xworkz.contact;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact" , loadOnStartup = 1)
public class Contactdata extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("runing service in contatcdata");

        String name = servletRequest.getParameter("Name");
        String gmail = servletRequest.getParameter("email");
        String phone = servletRequest.getParameter("number");
        String comments = servletRequest.getParameter("comments");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("contactResult.jsp");



        servletRequest.setAttribute("nn",name);
        servletRequest.setAttribute("mail",gmail);
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
