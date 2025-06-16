package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.services.JobService;
import com.xworkz.general.services.JobServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/job" , loadOnStartup = 1)
public class JobApplication extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {

        String name =  servletRequest.getParameter("fullName");
        String email = servletRequest.getParameter("email");
        String education = servletRequest.getParameter("education");
        String skill = servletRequest.getParameter("skill");
        String salary =servletRequest.getParameter("expectedSalary");
        String experience =servletRequest.getParameter("experience");




        JobApplicationDTO jobApplicationDTO= new JobApplicationDTO();
        jobApplicationDTO.setName(name);
        jobApplicationDTO.setEmail(email);
        jobApplicationDTO.setEducation(education);
        jobApplicationDTO.setSkill(skill);
        jobApplicationDTO.setSalary(Double.parseDouble(salary));
        jobApplicationDTO.setExperience(Integer.parseInt(experience));
        System.out.println("job application :"+jobApplicationDTO);

        JobService jobService = new JobServiceImp();
        String job = jobService.validationAndSave(jobApplicationDTO);
        System.out.println("Job Service :" + job );


        //servletRequest.setAttribute("job",jobApplicationDTO);
//        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("JobAppResult.jsp");
//        servletRequest.setAttribute("name",name);
//        servletRequest.setAttribute("salary",salary);
//        requestDispatcher.forward(servletRequest, servletResponse);

    }
}
