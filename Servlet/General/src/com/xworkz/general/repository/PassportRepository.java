package com.xworkz.general.repository;

import com.xworkz.general.dto.PassportApplicationDTO;

public interface PassportRepository {
    String save(PassportApplicationDTO passportApplicationDTO);
}
