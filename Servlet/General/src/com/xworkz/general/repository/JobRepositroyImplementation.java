package com.xworkz.general.repository;

import com.xworkz.general.dto.JobApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositroyImplementation implements JobRepositroy {
    @Override
    public String save(JobApplicationDTO jobApplicationDTO){
        System.out.println("Saving the JobApplicationDTO in db... ");
        System.out.println("WARN: Connected to db");
;
        try {
            // step 1 : load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";
            // Step 2: create a connection
            Connection connection = DriverManager.getConnection(url,username,password);
            //step 3: prepare the statement
            String sql = "insert into job_table values(0,'"+jobApplicationDTO.getName()+"','"+jobApplicationDTO.getEmail()+"','"+jobApplicationDTO.getEducation()+"','"+jobApplicationDTO.getSkill()+"','"+ jobApplicationDTO.getSalary()+"','"+jobApplicationDTO.getExperience()+"')";
            Statement statement = connection.createStatement();
            //step 4: execute the statement
            statement.executeUpdate(sql);
            System.out.println("database ; "+ connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return " ";
    }
}
