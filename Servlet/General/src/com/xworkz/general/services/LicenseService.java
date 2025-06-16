package com.xworkz.general.services;

import com.xworkz.general.dto.BirthApplicationDTO;
import com.xworkz.general.dto.LicenseApplicationDTO;

public interface LicenseService {
    String validationAndSave(LicenseApplicationDTO licenseApplicationDTO );
}
