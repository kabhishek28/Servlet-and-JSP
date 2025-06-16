package com.xworkz.general.services;

import com.xworkz.general.dto.BirthApplicationDTO;

public interface BirthService {
    String validationAndSave(BirthApplicationDTO birthApplicationDTO);
}
