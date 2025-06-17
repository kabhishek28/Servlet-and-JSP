package com.xworkz.hostel.service;

import com.xworkz.hostel.dto.HostelDTO;
import com.xworkz.hostel.repository.HostelRepository;
import com.xworkz.hostel.repository.HostelRepositoryImplementation;

public class HostelServiceImplementation implements HostelService{
    @Override
    public String validateAndSave(HostelDTO hostelDTO) {
        HostelRepository hostelRepository = new HostelRepositoryImplementation();
        hostelRepository.save(hostelDTO);
        return "failed";
    }
}
