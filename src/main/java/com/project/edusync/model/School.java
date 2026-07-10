package com.project.edusync.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "schools", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "school_code", unique = true)
    private String schoolCode;

    @Column(name = "school_type")
    private String schoolType;

    @Column(name = "board_curriculum")
    private String boardCurriculum;

    @Column(name = "established_year")
    private int establishedYear;

    @Column(name = "school_email", nullable = false)
    private String schoolEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String website;

    @Column(name = "subdomain", unique = true)
    private String subDomain;

    @Column(nullable = false)
    private String status = "PENDING_ONBOARDING";

    @Column(name = "onboarding_step", nullable = false)
    private int onboardingStep = 1;

}
