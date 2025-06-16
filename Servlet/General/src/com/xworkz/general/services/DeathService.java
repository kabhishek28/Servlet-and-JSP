package com.xworkz.general.services;

import com.xworkz.general.dto.DeathApplicationDTO;

public interface DeathService {
    String validationAndSave(DeathApplicationDTO deathApplicationDTO);
}
