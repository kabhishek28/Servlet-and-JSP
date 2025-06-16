package com.xworkz.general.repository;

import com.xworkz.general.dto.MarriageApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MarriageRepositoryImplementation implements MarriageRepository{
    @Override
    public String save(MarriageApplicationDTO marriageApplicationDTO) {
        System.out.println("Saving the MarriageApplicationDTO in db... ");
        System.out.println("WARN: Connected to db");

        //step 1: load and register
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "Abhi@2003";
            //step 2: creation connection
            Connection connection = DriverManager.getConnection(url,userName,password);
            //step 3: prepare and statement
            String sql = "insert into marriage_table value(0,'"+marriageApplicationDTO.getGroomName()+"','"+marriageApplicationDTO.getBrideName()+"','"+marriageApplicationDTO.getLocation()+"','"+marriageApplicationDTO.getReligion()+"','"+marriageApplicationDTO.getAddress()+"','"+marriageApplicationDTO.getMarriageDate()+"','"+marriageApplicationDTO.getOfficerPresent()+"','"+marriageApplicationDTO.getWitness1()+"','"+marriageApplicationDTO.getWitness2()+"')";
            Statement statement = connection.createStatement();
            //step 4:execute the statement
            statement.executeUpdate(sql);
            System.out.println("database :"+ connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "";
    }
}
