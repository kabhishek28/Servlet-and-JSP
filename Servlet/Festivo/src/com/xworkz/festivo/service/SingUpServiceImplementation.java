package com.xworkz.festivo.service;

import com.xworkz.festivo.dto.SingInDTO;
import com.xworkz.festivo.dto.SingUpDTO;
import com.xworkz.festivo.repository.SingUpRepository;
import com.xworkz.festivo.repository.SingUpRepositoryImplementation;

public class SingUpServiceImplementation implements SingUpService{
    @Override
    public String validationAndSave(SingUpDTO singUpDTO) {
        String name = singUpDTO.getName();
        String email = singUpDTO.getEmail();
        String password = singUpDTO.getPassword();
        String confirmPassword  = singUpDTO.getConfirmPassword();

        if(name == null || name.length() < 3 || name.length() > 15){
            System.out.println("enter the valid Name");
            return "please enter the valid name";
        }
        if(!password.equals(confirmPassword) ){
            System.out.println("Confirm Password is not matching ");
            return "please Check the Confirm Password";
        }else{
            System.out.println("SingUp Completed");
             SingUpRepository singUpRepository = new SingUpRepositoryImplementation();
            String repomessage = singUpRepository.save(singUpDTO);
            System.out.println("Repo Message : " + repomessage);
            return "SingUp Completed";
        }



    }

    @Override
    public String validationAndSave(SingInDTO singInDTO) {
        SingUpRepository singUpRepository = new SingUpRepositoryImplementation();
        String check = singUpRepository.checkData(singInDTO);
        return check;
    }
}
