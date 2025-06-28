package com.xworkz.festivo.servlet;

import com.xworkz.festivo.dto.SingUpDTO;
import com.xworkz.festivo.service.SingUpService;
import com.xworkz.festivo.service.SingUpServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/singin",loadOnStartup = 1)
public class SingIn extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("nameName");
        String gmail = req.getParameter("email");
        String password  = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmpassword");

        SingUpDTO singUpDTO = new SingUpDTO(name,gmail,password,confirmPassword);
        System.out.println("singUpDto : " + singUpDTO.getName());

        SingUpService singUpService = new SingUpServiceImplementation();
        String message = singUpService.validationAndSave(singUpDTO);

        if(!message.equals("SingUp Completed")){
            switch (message){
                case "please enter the valid name":
                    req.setAttribute("nameError",message);
                    break;
                case "please Check the Confirm Password":
                    req.setAttribute("passwordError",message);
                    break;
            }

            req.setAttribute("dto",singUpDTO);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("singUp.jsp");
            requestDispatcher.forward(req,resp);
        }else{

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("singIn.jsp");
            requestDispatcher.forward(req,resp);
        }



    }


}


