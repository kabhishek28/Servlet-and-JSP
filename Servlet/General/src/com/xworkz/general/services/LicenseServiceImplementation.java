package com.xworkz.general.services;

import com.xworkz.general.dto.LicenseApplicationDTO;
import com.xworkz.general.repository.LicenseRepository;
import com.xworkz.general.repository.LicenseRepositoryImplementation;

public class LicenseServiceImplementation implements LicenseService{
    @Override
    public String validationAndSave(LicenseApplicationDTO licenseApplicationDTO) {
        LicenseRepository licenseRepository = new LicenseRepositoryImplementation();
        licenseRepository.save(licenseApplicationDTO);
        return "Failed";
    }
}
