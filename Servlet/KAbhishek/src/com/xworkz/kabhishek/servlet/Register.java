package com.xworkz.kabhishek.servlet;

import com.xworkz.kabhishek.dto.RegisterDTO;
import com.xworkz.kabhishek.service.RegisterService;
import com.xworkz.kabhishek.service.RegisterServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/registerdata" , loadOnStartup = 1)
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("i am in register class is running ");
        String name = req.getParameter("nameName");
        String email = req.getParameter("emailName");
        String phoneNo = req.getParameter("mobileName");
        String gender = req.getParameter("genderName");
        String address = req.getParameter("addressName");

        RegisterDTO registerDTO = new RegisterDTO(name,email,phoneNo,gender,address);
        System.out.println("Register data : "+ registerDTO);

        RegisterService registerService = new RegisterServiceImplementation();
        String message = registerService.validationAndSave(registerDTO);


        if(!message.equals("Register submitted done")){
            switch (message){
                case  "please enter the valid name":
                    req.setAttribute("returnmessage" , message);
                    break;
                case "please enter the 10 numbers":
                    req.setAttribute("returnmessagee" , message);
                    break;

            }

            req.setAttribute("dto",registerDTO);
        }



        RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
//        req.setAttribute("returnmessage" , message);
        requestDispatcher.forward(req,resp);





    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("registerName");
        int convertedID = Integer.parseInt(id);
        System.out.println("Converted ID :" + convertedID);

      RegisterService registerService = new RegisterServiceImplementation();
      RegisterDTO registerDTO = registerService.getRegisterID(convertedID);
      if(registerDTO == null){
          System.out.println("register ID is null ");
      }else{
          System.out.println("register ID data found");

      }
       System.out.println("Register ID data : " + registerDTO.getName() +" "+registerDTO.getAddress()+" "+registerDTO.getEmail());

    }
}
