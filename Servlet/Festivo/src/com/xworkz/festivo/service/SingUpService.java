package com.xworkz.festivo.service;

import com.xworkz.festivo.dto.SingInDTO;
import com.xworkz.festivo.dto.SingUpDTO;

public interface SingUpService {
    String validationAndSave(SingUpDTO singUpDTO);

    String validationAndSave(SingInDTO singInDTO);
}
