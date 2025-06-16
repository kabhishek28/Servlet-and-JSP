package com.xworkz.general.repository;

import com.xworkz.general.dto.PassportApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassportRepositoryImplementation implements PassportRepository{
    @Override
    public String save(PassportApplicationDTO passportApplicationDTO) {

        System.out.println("Saving the PassportApplicationDTO in db... ");
        System.out.println("WARN: Connected to db");


        //step 1: load and register
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "Abhi@2003";
            //step 2: create connection
            Connection connection = DriverManager.getConnection(url,userName,password);
            //step 3: prepare the statement
            String sql = "insert into passport_table values(0,'"+passportApplicationDTO.getApplicantName()+"','"+passportApplicationDTO.getAdharName()+"','"+passportApplicationDTO.getPanName()+"','"+passportApplicationDTO.getPassporttypeName()+"','"+passportApplicationDTO.getAddressName()+"','"+passportApplicationDTO.getCountryName()+"','"+passportApplicationDTO.getStateName()+"','"+passportApplicationDTO.getCityName()+"','"+passportApplicationDTO.getPinName()+"','"+passportApplicationDTO.getPaymentName()+"')";
            Statement statement = connection.createStatement();
            //step 4: execute the statement
            statement.executeUpdate(sql);
            System.out.println("database :"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
