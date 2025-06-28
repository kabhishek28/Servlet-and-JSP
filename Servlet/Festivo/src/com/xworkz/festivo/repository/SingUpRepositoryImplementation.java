package com.xworkz.festivo.repository;

import com.xworkz.festivo.dto.SingInDTO;
import com.xworkz.festivo.dto.SingUpDTO;

import java.sql.*;

public class SingUpRepositoryImplementation implements SingUpRepository{
    @Override
    public String save(SingUpDTO singUpDTO){
        System.out.println("Saving the SingUp data into DataBase");
        System.out.println("WARN : Connected to db" );

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";

            Connection connection = DriverManager.getConnection(url,username,password);

            String sql = "insert into singup_festivo values(0,'"+singUpDTO.getName()+"','"+singUpDTO.getEmail()+"','"+singUpDTO.getConfirmPassword()+"');";

            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);
            System.out.println("data base :"+connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "DB save Done  ";
    }

    @Override
    public String checkData(SingInDTO singInDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc.singup_festivo";
            String username = "root";
            String password = "Abhi@2003";

            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, singInDTO.getEmail());
            stmt.setString(2, singInDTO.getPassword());

            ResultSet rs = stmt.executeQuery(); // ✅ FIXED HERE

            if (rs.next()) {
                return "data found";
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "data not found";
    }
}


















//System.out.println("Saving the register data in to database");
//        System.out.println("WARN: Connected to db");
//        try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//String url = "jdbc:mysql://localhost:3306/jdbc";
//String username = "root";
//String password = "Abhi@2003";
//
//Connection connection = DriverManager.getConnection(url,username,password);
//
//String sql = "insert into register_table values(0,'"+registerDTO.getName()+"','"+registerDTO.getEmail()+"','"+registerDTO.getPhoneNo()+"','"+registerDTO.getGender()+"','"+registerDTO.getAddress()+"')";
//Statement statement = connection.createStatement();
//
//            statement.executeUpdate(sql);
//            System.out.println("connection : "+ connection);
//
//
//        } catch (ClassNotFoundException | SQLException e) {
//        throw new RuntimeException(e);
//        }
//
//
//                return "Register Repository Implementation";
//                }
//
//@Override
//public RegisterDTO getData(int registerID)  {
//    System.out.println("Getting data from the  Data Base");
//    System.out.println("WARN: Connected to db");
//
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/jdbc";
//        String username = "root";
//        String password = "Abhi@2003";
//
//        Connection connection = DriverManager.getConnection(url,username,password);
//        String sql = "select * from register_table where id = "+registerID+";";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//        System.out.println("result set : " + resultSet);
//        while (resultSet.next()){
//            int pk =  resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            String email = resultSet.getString("email");
//            String phoneNo = resultSet.getString("phoneNo");
//            String gender = resultSet.getString("gender");
//            String address = resultSet.getString("address");
//
//
//
//            RegisterDTO registerDTO = new RegisterDTO(name,email,phoneNo,gender,address);
//            registerDTO.setPk(pk);
//            return registerDTO;
//
//
//        }
//
//    } catch (ClassNotFoundException | SQLException e) {
//        throw new RuntimeException(e);
//    }
//
//
//    return null;
//}