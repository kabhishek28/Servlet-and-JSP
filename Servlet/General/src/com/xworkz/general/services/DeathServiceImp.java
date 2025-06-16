package com.xworkz.general.services;

import com.xworkz.general.dto.DeathApplicationDTO;
import com.xworkz.general.repository.DeathRepositroy;
import com.xworkz.general.repository.DeathRepositroyImplementation;

public class DeathServiceImp implements DeathService{
    @Override
    public String validationAndSave(DeathApplicationDTO deathApplicationDTO) {
        DeathRepositroy deathRepo = new DeathRepositroyImplementation();
        deathRepo.save(deathApplicationDTO);
        return "failed";
    }
}
