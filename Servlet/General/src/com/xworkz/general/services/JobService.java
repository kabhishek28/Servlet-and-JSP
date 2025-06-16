package com.xworkz.general.services;

import com.xworkz.general.dto.JobApplicationDTO;

public interface JobService {
    String validationAndSave(JobApplicationDTO jobApplicationDTO);
}
