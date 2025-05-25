package com.xworkz.rcb;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/rcb",loadOnStartup = 1)
public class RCB extends GenericServlet {


   public RCB(){
       System.out.println("--------------IPL team ---------------");
   }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("-----------------------hi-----------------------");
    }
}
