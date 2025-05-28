package com.xworkz.laptop;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns= "/lap",loadOnStartup = 1)
public class laptopRunner {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

       String name= servletRequest.getParameter("lapname");
       String price=servletRequest.getParameter("lapprice");

//       int price_of_lap=Integer.parseInt("price");
//       Integer price_of_laptop=Integer.valueOf("price");

      PrintWriter writer= servletResponse.getWriter();
      servletResponse.setContentType("text/html");
      writer.println("<html><body><h1>"+name+"<br>Sucessfully Submitted</h1><br><h1>"+price+"</h1></body></html>");
    }
}