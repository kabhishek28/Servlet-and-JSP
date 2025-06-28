package com.xworkz.kabhishek.service;

import com.xworkz.kabhishek.dto.RegisterDTO;

public interface RegisterService {
    String validationAndSave (RegisterDTO registerDTO);

    RegisterDTO getRegisterID(int registerID);
}
