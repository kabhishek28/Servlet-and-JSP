package com.xworkz.festivo.servlet;

import com.xworkz.festivo.dto.SingInDTO;
import com.xworkz.festivo.service.SingUpService;
import com.xworkz.festivo.service.SingUpServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home" , loadOnStartup = 1)
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("emailName");
        String password = req.getParameter("passwordName");
        System.out.println("eeeee");
        SingInDTO singInDTO = new SingInDTO(email, password);
        SingUpService singUpService = new SingUpServiceImplementation();
        String check = singUpService.validationAndSave(singInDTO);
        if (!check.equals("data found")) {
            System.out.println("this data is not found");
        } else {
            System.out.println("data is found ");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}
