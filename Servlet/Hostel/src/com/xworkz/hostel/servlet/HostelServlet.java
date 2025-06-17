package com.xworkz.hostel.servlet;

import com.xworkz.hostel.dto.HostelDTO;
import com.xworkz.hostel.service.HostelService;
import com.xworkz.hostel.service.HostelServiceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hostel" , loadOnStartup = 1)
public class HostelServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nameName");
        String email = req.getParameter("emailName");
        String phoneNo = req.getParameter("phoneName");
        String address = req.getParameter("addressName");
        String college = req.getParameter("collegeName");
        String gender = req.getParameter("genderName");
        String age = req.getParameter("ageName");
        String check = req.getParameter("checkName");

        int agee = Integer.parseInt(age);
        boolean checkk = Boolean.parseBoolean(check);

        HostelDTO hostelDTO = new HostelDTO(name,email,phoneNo,address,college,gender,agee,checkk);
        System.out.println("Hostel Data :"+hostelDTO);

        HostelService hostelService = new HostelServiceImplementation();
        String hostel = hostelService.validateAndSave(hostelDTO);
        System.out.println("Hostel :"+hostel);




    }
}
