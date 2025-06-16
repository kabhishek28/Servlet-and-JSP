package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageApplicationDTO;
import com.xworkz.general.services.MarriageService;
import com.xworkz.general.services.MarriageServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/marriage" , loadOnStartup = 1)
public class MarriageApplication extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName  = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String religion = req.getParameter("religion");
        String address = req.getParameter("address");
        String marriageDate = req.getParameter("marriageDate");
        String officerPresent = req.getParameter("officerPresent");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");

        MarriageApplicationDTO marriageApplicationDTO = new MarriageApplicationDTO(groomName,brideName,location,religion,address,marriageDate,officerPresent,witness1,witness2);
        req.setAttribute("marriage",marriageApplicationDTO);

        MarriageService marriageService = new MarriageServiceImplementation();
       String marriage = marriageService.validationAndSave(marriageApplicationDTO);
        System.out.println("Marriage :"+marriage);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("marriageAppResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
