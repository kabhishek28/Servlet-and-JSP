package com.xworkz.general.repository;

import com.xworkz.general.dto.LicenseApplicationDTO;

public interface LicenseRepository {
    String save (LicenseApplicationDTO licenseApplicationDTO);
}
