package com.xworkz.kabhishek.service;

import com.xworkz.kabhishek.dto.RegisterDTO;
import com.xworkz.kabhishek.repository.RegisterRepository;
import com.xworkz.kabhishek.repository.RegisterRepositoryImplementation;

public class RegisterServiceImplementation implements RegisterService {
    @Override
    public String validationAndSave(RegisterDTO registerDTO) {

        String name = registerDTO.getName();
        String phoneNo = registerDTO.getPhoneNo();
        if(name == null || name.length() < 3 || name.length()>10){
            System.out.println("enter the valid name");
            return "please enter the valid name";
        }
        if(phoneNo.length() != 10){
            System.out.println("enter the 10 number");
            return "please enter the 10 numbers";

        }

        RegisterRepository registerRepository = new RegisterRepositoryImplementation();
        registerRepository.save(registerDTO);
        return "Register submitted done";
    }

    @Override
    public RegisterDTO getRegisterID(int registerID) {
        if (registerID <= 0) {
            System.out.println("enter the RegisterID greater than 0 ");
            return null;
        } else {
            System.out.println("entered ID is valid");
            RegisterRepository registerRepository = new RegisterRepositoryImplementation();
            RegisterDTO registerDTO = registerRepository.getData(registerID);
            return registerDTO;

        }

//        return null;
    }



}
