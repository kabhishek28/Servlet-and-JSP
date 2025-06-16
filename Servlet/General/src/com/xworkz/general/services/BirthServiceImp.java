package com.xworkz.general.services;


import com.xworkz.general.dto.BirthApplicationDTO;
import com.xworkz.general.repository.BirthRepository;
import com.xworkz.general.repository.BirthRepositroyImplementation;

public class BirthServiceImp implements BirthService {

    @Override
    public String validationAndSave(BirthApplicationDTO birthApplicationDTO) {
        BirthRepository birthRepo = new BirthRepositroyImplementation() ;
        birthRepo.save(birthApplicationDTO);
        return "failed";

    }
}
