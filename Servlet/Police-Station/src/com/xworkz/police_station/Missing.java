package com.xworkz.police_station;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/missing",loadOnStartup = 1)
public class Missing extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("missingPersonName");
        String mobile = servletRequest.getParameter("complainteeMobile");
        String age = servletRequest.getParameter("missingPersonAge");
        String gender = servletRequest.getParameter("missingPersonGender");
        String language = servletRequest.getParameter("languageKnown");
        String identifyingMarks = servletRequest.getParameter("identifyingMarks");
        String address = servletRequest.getParameter("address");
        String lastLocation = servletRequest.getParameter("location");




        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("missingResult.jsp");
        servletRequest.setAttribute("missingPersonName",name);
        servletRequest.setAttribute("complainteeMobile",mobile);
        servletRequest.setAttribute("missingPersonAge",age);
        servletRequest.setAttribute("missingPersonGender",gender);
        servletRequest.setAttribute("languageKnown",language);
        servletRequest.setAttribute("identifyingMarks",identifyingMarks);
        servletRequest.setAttribute("address",address);
        servletRequest.setAttribute("location",lastLocation);
        requestDispatcher.forward(servletRequest,servletResponse);










    }
}
