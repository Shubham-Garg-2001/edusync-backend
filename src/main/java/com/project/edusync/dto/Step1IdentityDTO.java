package com.project.edusync.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Step1IdentityDTO {
    
    // School data

    private String name;
    private String schoolCode;
    private String schoolType;
    private String boardCurriculum;
    private Integer establishedYear;
    private String schoolEmail;
    private String phoneNumber; 
    private String website;

    // Address data

    private String addressLine1;
    private String city;
    private String stateProvince;
    private String country;
    private String postalCode;

}
