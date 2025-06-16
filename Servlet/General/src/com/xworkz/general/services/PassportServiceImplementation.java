package com.xworkz.general.services;

import com.xworkz.general.dto.PassportApplicationDTO;
import com.xworkz.general.repository.PassportRepository;
import com.xworkz.general.repository.PassportRepositoryImplementation;

public class PassportServiceImplementation implements PassportService{
    @Override
    public String validationandsave(PassportApplicationDTO passportApplicationDTO) {
        PassportRepository passportRepository = new PassportRepositoryImplementation();
        passportRepository.save(passportApplicationDTO);
        return "failed";
    }
}
