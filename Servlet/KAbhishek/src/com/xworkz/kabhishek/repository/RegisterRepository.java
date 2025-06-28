package com.xworkz.kabhishek.repository;

import com.xworkz.kabhishek.dto.RegisterDTO;

import java.sql.SQLException;

public interface RegisterRepository {
    String save (RegisterDTO registerDTO);

    RegisterDTO getData(int registerID) ;
}
