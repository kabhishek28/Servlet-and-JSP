package com.xworkz.general.services;

import com.xworkz.general.dto.MarriageApplicationDTO;
import com.xworkz.general.repository.MarriageRepository;
import com.xworkz.general.repository.MarriageRepositoryImplementation;

public class MarriageServiceImplementation implements MarriageService{
    @Override
    public String validationAndSave(MarriageApplicationDTO marriageApplicationDTO) {
        MarriageRepository marriageRepository = new MarriageRepositoryImplementation();
        marriageRepository.save(marriageApplicationDTO);
        return "failed";
    }
}
