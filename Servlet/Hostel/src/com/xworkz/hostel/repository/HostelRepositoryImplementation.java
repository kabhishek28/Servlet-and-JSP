package com.xworkz.hostel.repository;

import com.xworkz.hostel.dto.HostelDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HostelRepositoryImplementation implements HostelRepository{
    @Override
    public String save(HostelDTO hostelDTO) {

        try {
            //step : load and   register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String pssword = "Abhi@2003";


            //step 2 : create connection
            Connection connection = DriverManager.getConnection(url,username,pssword);

            //step 3 : prepare the statement
            String sql = "insert into hostel_table value(0,'"+hostelDTO.getName()+"','"+hostelDTO.getEmail()+"','"+hostelDTO.getPhoneno()+"','"+hostelDTO.getAddress()+"','"+hostelDTO.getCollege()+"','"+hostelDTO.getGender()+"',"+hostelDTO.getAge()+","+hostelDTO.isCheck()+")";
            Statement statement = connection.createStatement();

            //step 4 : execute statement
            statement.executeUpdate(sql);
            System.out.println("database :"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
