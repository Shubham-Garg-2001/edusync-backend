package com.project.edusync.controller;

import com.project.edusync.dto.Step1IdentityDTO;
import com.project.edusync.service.OnboardingService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/onboarding")
public class OnboardingController {

    private final OnboardingService onboardingService;

    public OnboardingController(OnboardingService onboardingService) {
        this.onboardingService = onboardingService;
    }

    @PutMapping("/{schoolId}/step-1")
    public ResponseEntity<String> saveStep1(
            @PathVariable Long schoolId,
            @RequestBody Step1IdentityDTO dto) {
        onboardingService.saveStep1(schoolId, dto);

        return ResponseEntity.ok("Step 1 saved successfully for school ID : " + schoolId);
    }

}
