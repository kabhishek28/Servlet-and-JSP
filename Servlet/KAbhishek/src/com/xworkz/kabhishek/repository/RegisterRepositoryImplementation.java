package com.xworkz.kabhishek.repository;

import com.xworkz.kabhishek.dto.RegisterDTO;

import java.sql.*;

public class RegisterRepositoryImplementation implements RegisterRepository{
    @Override
    public String save(RegisterDTO registerDTO) {
        System.out.println("Saving the register data in to database");
        System.out.println("WARN: Connected to db");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";

            Connection connection = DriverManager.getConnection(url,username,password);

            String sql = "insert into register_table values(0,'"+registerDTO.getName()+"','"+registerDTO.getEmail()+"','"+registerDTO.getPhoneNo()+"','"+registerDTO.getGender()+"','"+registerDTO.getAddress()+"')";
            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);
            System.out.println("connection : "+ connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "Register Repository Implementation";
    }

    @Override
    public RegisterDTO getData(int registerID)  {
        System.out.println("Getting data from the  Data Base");
        System.out.println("WARN: Connected to db");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";

            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "select * from register_table where id = "+registerID+";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("result set : " + resultSet);
            while (resultSet.next()){
                int pk =  resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phoneNo = resultSet.getString("phoneNo");
                String gender = resultSet.getString("gender");
                String address = resultSet.getString("address");



                RegisterDTO registerDTO = new RegisterDTO(name,email,phoneNo,gender,address);
                registerDTO.setPk(pk);
                return registerDTO;


            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}
