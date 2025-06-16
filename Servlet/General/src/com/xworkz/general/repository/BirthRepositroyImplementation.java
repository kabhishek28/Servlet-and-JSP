package com.xworkz.general.repository;

import com.xworkz.general.dto.BirthApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirthRepositroyImplementation implements BirthRepository {
    @Override
    public String save(BirthApplicationDTO birthApplicationDTO) {
        System.out.println("Saving the BirthApplicationDTO in db...");
        System.out.println("WARN:connected to db");


        try {
            //step 1 :load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";
            //Step 2: create a connection
            Connection connection = DriverManager.getConnection(url,username,password);
            //step 3: Prepare the Statement
            String hospitalName=birthApplicationDTO.getHospitalName();
            if(hospitalName.contains("'"))
            {
                hospitalName=birthApplicationDTO.getHospitalName()+"'";
                System.out.println("modified hospitalName :"+hospitalName);
            }
            String sql = "insert into birth_table values(0,'"+birthApplicationDTO.getBirthID()+"','"+birthApplicationDTO.getFatherName()+"','"+birthApplicationDTO.getMotherName()+"','"+birthApplicationDTO.getDatetime()+"','"+birthApplicationDTO.getDoctorName()+"','"+birthApplicationDTO.getNurseName()+"','"+hospitalName+"','"+birthApplicationDTO.getHospitaltype()+"')";
            System.out.println("Generated SQL :"+sql);
            Statement statement = connection.createStatement();
            //step 4: execute the statement
            statement.executeUpdate(sql);
            System.out.println("database : " + connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return " ";
    }
}
