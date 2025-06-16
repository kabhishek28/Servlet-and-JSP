package com.xworkz.general.servlet;

import com.xworkz.general.dto.LicenseApplicationDTO;
import com.xworkz.general.services.LicenseService;
import com.xworkz.general.services.LicenseServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/drivingLicense",loadOnStartup = 1)
public class LicenseApplication extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName =req.getParameter("fullName");
        String mobile = req.getParameter("mobile");
        String address = req.getParameter("address");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");

        LicenseApplicationDTO licenseApplicationDTO = new LicenseApplicationDTO(fullName,mobile,address,appliedDate,vehicleType);
        req.setAttribute("license",licenseApplicationDTO);

        LicenseService licenseService = new LicenseServiceImplementation();
        String license =  licenseService.validationAndSave(licenseApplicationDTO);
        System.out.println("License :" + license);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("licenseAppResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
