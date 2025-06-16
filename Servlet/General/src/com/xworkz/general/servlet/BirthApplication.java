package com.xworkz.general.servlet;

import com.xworkz.general.dto.BirthApplicationDTO;
import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.services.BirthService;
import com.xworkz.general.services.BirthServiceImp;
import com.xworkz.general.services.JobService;
import com.xworkz.general.services.JobServiceImp;
import org.w3c.dom.ls.LSOutput;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/birth",loadOnStartup = 1)
public class BirthApplication extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

String birthID = req.getParameter("birthName");
String fatherName = req.getParameter("fatherName");
String motherName = req.getParameter("motherName");
String datetime = req.getParameter("datetime");
String doctorName = req.getParameter("doctorName");
String nurseName = req.getParameter("nurseName");
String hospitalName = req.getParameter("hospitalName");
String hospitaltype = req.getParameter("hospitaltypeName");

        BirthApplicationDTO birthApplicationDTO = new BirthApplicationDTO(birthID,fatherName,motherName,datetime,doctorName,nurseName,hospitalName,hospitaltype);
        System.out.println("birth application :::::"+birthApplicationDTO);

        req.setAttribute("birthApplicationDTO",birthApplicationDTO);

        BirthService birthService = new BirthServiceImp();
        String birth = birthService.validationAndSave(birthApplicationDTO);
        System.out.println("Birth Service :" + birth);



        RequestDispatcher requestDispatcher = req.getRequestDispatcher("birthAppResult.jsp");
        requestDispatcher.forward(req,resp);




    }


}
