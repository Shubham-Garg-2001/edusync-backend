package com.project.edusync.service;

import org.springframework.stereotype.Service;

import com.project.edusync.dto.Step1IdentityDTO;
import com.project.edusync.model.Address;
import com.project.edusync.model.School;
import com.project.edusync.repository.AddressRepo;
import com.project.edusync.repository.SchoolRepo;

import jakarta.transaction.Transactional;

@Service
public class OnboardingService {

    private final SchoolRepo schoolRepo;
    private final AddressRepo addressRepo;

    public OnboardingService(SchoolRepo schoolRepo, AddressRepo addressRepo) {
        this.schoolRepo = schoolRepo;
        this.addressRepo = addressRepo;
    }

    @Transactional
    public void saveStep1(Long schoolId, Step1IdentityDTO dto) {

        School school = schoolRepo.findById(schoolId)
                .orElseThrow(() -> new RuntimeException("School registration workspace not found."));

        school.setName(dto.getName());
        school.setSchoolCode(dto.getSchoolCode());
        school.setSchoolType(dto.getSchoolType());
        school.setBoardCurriculum(dto.getBoardCurriculum());
        school.setEstablishedYear(dto.getEstablishedYear());
        school.setSchoolEmail(dto.getSchoolEmail());
        school.setPhoneNumber(dto.getPhoneNumber());
        school.setWebsite(dto.getWebsite());

        school.setOnboardingStep(2);
        schoolRepo.save(school);

        Address address = addressRepo.findBySchoolId(schoolId)
                .orElse(new Address());

        address.setSchoolId(schoolId);
        address.setAddressLine1(dto.getAddressLine1());
        address.setCity(dto.getCity());
        address.setStateProvince(dto.getStateProvince());
        address.setCountry(dto.getCountry());
        address.setPostalCode(dto.getPostalCode());

        addressRepo.save(address);

    }

}
