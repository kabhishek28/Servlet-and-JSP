package com.xworkz.general.servlet;

import com.xworkz.general.dto.DeathApplicationDTO;
import com.xworkz.general.services.DeathService;
import com.xworkz.general.services.DeathServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/death",loadOnStartup = 1)
public class DeathApplication extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String gender = req.getParameter("gender");
        String age = req.getParameter("age");
        String dateOfDeath = req.getParameter("dateOfDeath");
        String timeOfDeath = req.getParameter("timeOfDeath");
        String causeOfDeath = req.getParameter("causeOfDeath");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String identificationMarks = req.getParameter("identificationMarks");

        DeathApplicationDTO deathApplicationDTO = new DeathApplicationDTO(fullName, gender, age, dateOfDeath, timeOfDeath, causeOfDeath, mannerOfDeath, certifiedBy, hospitalName, identificationMarks);
        req.setAttribute("deathApplicationDTO ", deathApplicationDTO);

        DeathService deathService = new DeathServiceImp();
        String death = deathService.validationAndSave(deathApplicationDTO);
        System.out.println("Death Service : " + death);


//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("deathAppResult.jsp");
//        requestDispatcher.forward(req, res);
    }
}
