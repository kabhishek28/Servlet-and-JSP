package com.xworkz.police_station;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/theft",loadOnStartup = 1)
public class Theft extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("nameName");
        String mobile = servletRequest.getParameter("mobile");
        String age = servletRequest.getParameter("age");
        String location = servletRequest.getParameter("location");
        String address = servletRequest.getParameter("address");
        String item = servletRequest.getParameter("item");
        String date = servletRequest.getParameter("date");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("theftResult.jsp");
        servletRequest.setAttribute("nameName",name);
        servletRequest.setAttribute("mobile",mobile);
        servletRequest.setAttribute("age",age);
        servletRequest.setAttribute("location",location);
        servletRequest.setAttribute("address",address);
        servletRequest.setAttribute("item",item);
        servletRequest.setAttribute("date",date);
        requestDispatcher.forward(servletRequest,servletResponse);










    }
}
