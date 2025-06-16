package com.xworkz.general.repository;

import com.xworkz.general.dto.LicenseApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LicenseRepositoryImplementation implements LicenseRepository{
    @Override
    public String save(LicenseApplicationDTO licenseApplicationDTO) {

        System.out.println("Saving the LicenseApplicationDTO in db... ");
        System.out.println("WARN: Connected to db");

        try {
            //step 1: load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "Abhi@2003";
            //step 2: Create Connection
            Connection connection = DriverManager.getConnection(url,userName,password);
            //step 3: prepare and statement
            String sql = "insert into license_table value(0,'"+licenseApplicationDTO.getFullName()+"','"+licenseApplicationDTO.getMobile()+"','"+licenseApplicationDTO.getAddress()+"','"+licenseApplicationDTO.getAppliedDate()+"','"+licenseApplicationDTO.getVehicleType()+"')";
            Statement statement = connection.createStatement();
            //step 4:execute the statement
            statement.executeUpdate(sql);
            System.out.println("database :"+ connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return " ";
    }
}
