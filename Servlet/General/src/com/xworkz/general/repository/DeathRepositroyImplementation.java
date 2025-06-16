package com.xworkz.general.repository;

import com.xworkz.general.dto.DeathApplicationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeathRepositroyImplementation implements DeathRepositroy {
    @Override
    public String save(DeathApplicationDTO deathApplicationDTO) {
        System.out.println("Saving the DeathApplicationDTO in db... ");
        System.out.println("WARN: Connected to db");

        try {
            //step 1 : load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Abhi@2003";
            //step 2 : create a Connection
            Connection connection = DriverManager.getConnection(url,username,password);
            //step 3 : prepare the statement
            String sql = "insert into death_table values(0,'"+deathApplicationDTO.getFullName()+"','"+deathApplicationDTO.getGender()+"','"+deathApplicationDTO.getAge()+"','"+deathApplicationDTO.getDateOfDeath()+"','"+deathApplicationDTO.getTimeOfDeath()+"','"+deathApplicationDTO.getCauseOfDeath()+"','"+deathApplicationDTO.getMannerOfDeath()+"','"+deathApplicationDTO.getCertifiedBy()+"','"+deathApplicationDTO.getHospitalName()+"','"+deathApplicationDTO.getIdentificationMarks()+"')";
            Statement statement = connection.createStatement();
            //step 4 : execute the statement
            statement.executeUpdate(sql);
            System.out.println("database ; "+ connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return " ";
    }

}
