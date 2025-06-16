package com.xworkz.general.servlet;

import com.xworkz.general.dto.PassportApplicationDTO;
import com.xworkz.general.services.PassportService;
import com.xworkz.general.services.PassportServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport" , loadOnStartup = 1)
public class PassportApplication extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String applicantName = req.getParameter("applicantName");
        String adharName = req.getParameter("adharName");
        String panName = req.getParameter("panName");
        String passporttypeName = req.getParameter("passporttypeName");
        String addressName = req.getParameter("addressName");
        String countryName = req.getParameter("countryName");
        String stateName = req.getParameter("stateName");
        String cityName = req.getParameter("cityName");
        String pinName = req.getParameter("pinName");
        String paymentName = req.getParameter("paymentName");


        PassportApplicationDTO passportApplicationDTO = new PassportApplicationDTO(applicantName,adharName,panName,passporttypeName,addressName,countryName,stateName,cityName,pinName,paymentName);
        req.setAttribute("passport",passportApplicationDTO);

        PassportService passportService = new PassportServiceImplementation();
        String passport = passportService.validationandsave(passportApplicationDTO);
        System.out.println("passport :"+passport);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("passportAppResult.jsp");
        requestDispatcher.forward(req,resp);

    }
}
