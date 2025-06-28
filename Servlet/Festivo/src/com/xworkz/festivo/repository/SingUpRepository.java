package com.xworkz.festivo.repository;

import com.xworkz.festivo.dto.SingInDTO;
import com.xworkz.festivo.dto.SingUpDTO;

public interface SingUpRepository {
    String save(SingUpDTO singUpDTO);

    String checkData(SingInDTO singInDTO);

}
