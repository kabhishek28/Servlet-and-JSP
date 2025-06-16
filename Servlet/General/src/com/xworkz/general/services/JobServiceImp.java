package com.xworkz.general.services;

import com.xworkz.general.dto.JobApplicationDTO;
import com.xworkz.general.repository.JobRepositroy;
import com.xworkz.general.repository.JobRepositroyImplementation;

public class JobServiceImp implements JobService{
//    @Override
    public String validationAndSave(JobApplicationDTO jobApplicationDTO) {
        JobRepositroy jobRepo = new JobRepositroyImplementation();
        jobRepo.save(jobApplicationDTO);
        return "Failed";
    }
}
