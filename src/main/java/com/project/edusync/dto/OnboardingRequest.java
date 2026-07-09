package com.project.edusync.dto;

import com.project.edusync.validation.*;
import java.math.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class OnboardingRequest {

    // ==========================================
    // STEP 1: SCHOOL IDENTITY & ADDRESS
    // ==========================================
    @NotBlank(groups = OnboardStep_1.class, message = "School name is required")
    private String name;

    @NotBlank(groups = OnboardStep_1.class, message = "School code is required")
    private String schoolCode;

    private String schoolType;
    private String boardCurriculum;
    private Integer establishedYear;

    @NotBlank(groups = OnboardStep_1.class, message = "School email is required")
    @Email(groups = OnboardStep_1.class, message = "Invalid email format")
    private String schoolEmail;

    private String phoneNumber;
    private String website;

    @NotBlank(groups = OnboardStep_1.class, message = "Subdomain prefix is required")
    private String subdomain;

    // Address fields embedded directly for Step 1
    @NotBlank(groups = OnboardStep_1.class, message = "Address line 1 is required")
    private String addressLine1;

    @NotBlank(groups = OnboardStep_1.class, message = "City is required")
    private String city;

    @NotBlank(groups = OnboardStep_1.class, message = "State/Province is required")
    private String stateProvince;

    @NotBlank(groups = OnboardStep_1.class, message = "Country is required")
    private String country;

    @NotBlank(groups = OnboardStep_1.class, message = "Postal code is required")
    private String postalCode;

    // ==========================================
    // STEP 2: PRIMARY ADMIN SETUP
    // ==========================================
    @NotBlank(groups = OnboardStep_2.class, message = "Admin full name is required")
    private String adminFullName;

    @NotBlank(groups = OnboardStep_2.class, message = "Institutional email is required")
    @Email(groups = OnboardStep_2.class)
    private String institutionalEmail;

    @NotBlank(groups = OnboardStep_2.class, message = "Password is required")
    @Size(min = 8, groups = OnboardStep_2.class, message = "Password must be at least 8 characters")
    private String password;

    @NotBlank(groups = OnboardStep_2.class, message = "Primary phone number is required")
    private String primaryPhone;

    private String alternateContact;
    private String designationRole;
    private String department;
    private String preferredLanguage;
    private String timeZone;

    // ==========================================
    // STEP 3: ACADEMIC STRUCTURE
    // ==========================================
    @NotBlank(groups = OnboardStep_3.class, message = "Academic session name is required")
    private String yearName;

    @NotNull(groups = OnboardStep_3.class, message = "Start date is required")
    private LocalDate startDate;

    @NotNull(groups = OnboardStep_3.class, message = "Opening time is required")
    private LocalTime openingTime;

    @NotNull(groups = OnboardStep_3.class, message = "Closing time is required")
    private LocalTime closingTime;

    @NotEmpty(groups = OnboardStep_3.class, message = "At least one working day must be specified")
    private List<String> workingDays;

    // Inner classes/DTO elements for classes, sections, and terms can be managed
    // inside the request body payload
    private List<String> terms;
    private List<ClassSetupDto> classes;

    // ==========================================
    // STEP 4: FEES & MODULES
    // ==========================================
    private String defaultCurrency;
    private BigDecimal annualTuitionFee;
    private BigDecimal one_time_admission_fee;
    private BigDecimal standardExamFee;
    private Boolean enableInstallments;

    private Boolean studentManagementEnabled;
    private Boolean academicsEnabled;
    private Boolean attendanceEnabled;
    private Boolean timetable_enabled;
    private Boolean feeManagementEnabled;
    private Boolean aiInsightsEnabled;
    private Boolean staffHrEnabled;
    private Boolean inventoryEnabled;

    // ==========================================
    // STEP 5: BRANDING & PREFERENCES
    // ==========================================
    private String primaryColorHex;
    private String secondaryColorHex;
    private String dateFormat;
    private String weekStart;
    private Boolean smsAlertsEnabled;
    private Boolean systemPushNotificationsEnabled;

    // --- Sub DTO Helper for Nested Class/Section Configurations ---
    public static class ClassSetupDto {
        private String className;
        private List<String> sections;

        // Getters and Setters...
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getBoardCurriculum() {
        return boardCurriculum;
    }

    public void setBoardCurriculum(String boardCurriculum) {
        this.boardCurriculum = boardCurriculum;
    }

    public Integer getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(Integer establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAdminFullName() {
        return adminFullName;
    }

    public void setAdminFullName(String adminFullName) {
        this.adminFullName = adminFullName;
    }

    public String getInstitutionalEmail() {
        return institutionalEmail;
    }

    public void setInstitutionalEmail(String institutionalEmail) {
        this.institutionalEmail = institutionalEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getAlternateContact() {
        return alternateContact;
    }

    public void setAlternateContact(String alternateContact) {
        this.alternateContact = alternateContact;
    }

    public String getDesignationRole() {
        return designationRole;
    }

    public void setDesignationRole(String designationRole) {
        this.designationRole = designationRole;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public List<String> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(List<String> workingDays) {
        this.workingDays = workingDays;
    }

    public List<String> getTerms() {
        return terms;
    }

    public void setTerms(List<String> terms) {
        this.terms = terms;
    }

    public List<ClassSetupDto> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassSetupDto> classes) {
        this.classes = classes;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public BigDecimal getAnnualTuitionFee() {
        return annualTuitionFee;
    }

    public void setAnnualTuitionFee(BigDecimal annualTuitionFee) {
        this.annualTuitionFee = annualTuitionFee;
    }

    public BigDecimal getOne_time_admission_fee() {
        return one_time_admission_fee;
    }

    public void setOne_time_admission_fee(BigDecimal one_time_admission_fee) {
        this.one_time_admission_fee = one_time_admission_fee;
    }

    public BigDecimal getStandardExamFee() {
        return standardExamFee;
    }

    public void setStandardExamFee(BigDecimal standardExamFee) {
        this.standardExamFee = standardExamFee;
    }

    public Boolean getEnableInstallments() {
        return enableInstallments;
    }

    public void setEnableInstallments(Boolean enableInstallments) {
        this.enableInstallments = enableInstallments;
    }

    public Boolean getStudentManagementEnabled() {
        return studentManagementEnabled;
    }

    public void setStudentManagementEnabled(Boolean studentManagementEnabled) {
        this.studentManagementEnabled = studentManagementEnabled;
    }

    public Boolean getAcademicsEnabled() {
        return academicsEnabled;
    }

    public void setAcademicsEnabled(Boolean academicsEnabled) {
        this.academicsEnabled = academicsEnabled;
    }

    public Boolean getAttendanceEnabled() {
        return attendanceEnabled;
    }

    public void setAttendanceEnabled(Boolean attendanceEnabled) {
        this.attendanceEnabled = attendanceEnabled;
    }

    public Boolean getTimetable_enabled() {
        return timetable_enabled;
    }

    public void setTimetable_enabled(Boolean timetable_enabled) {
        this.timetable_enabled = timetable_enabled;
    }

    public Boolean getFeeManagementEnabled() {
        return feeManagementEnabled;
    }

    public void setFeeManagementEnabled(Boolean feeManagementEnabled) {
        this.feeManagementEnabled = feeManagementEnabled;
    }

    public Boolean getAiInsightsEnabled() {
        return aiInsightsEnabled;
    }

    public void setAiInsightsEnabled(Boolean aiInsightsEnabled) {
        this.aiInsightsEnabled = aiInsightsEnabled;
    }

    public Boolean getStaffHrEnabled() {
        return staffHrEnabled;
    }

    public void setStaffHrEnabled(Boolean staffHrEnabled) {
        this.staffHrEnabled = staffHrEnabled;
    }

    public Boolean getInventoryEnabled() {
        return inventoryEnabled;
    }

    public void setInventoryEnabled(Boolean inventoryEnabled) {
        this.inventoryEnabled = inventoryEnabled;
    }

    public String getPrimaryColorHex() {
        return primaryColorHex;
    }

    public void setPrimaryColorHex(String primaryColorHex) {
        this.primaryColorHex = primaryColorHex;
    }

    public String getSecondaryColorHex() {
        return secondaryColorHex;
    }

    public void setSecondaryColorHex(String secondaryColorHex) {
        this.secondaryColorHex = secondaryColorHex;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    public Boolean getSmsAlertsEnabled() {
        return smsAlertsEnabled;
    }

    public void setSmsAlertsEnabled(Boolean smsAlertsEnabled) {
        this.smsAlertsEnabled = smsAlertsEnabled;
    }

    public Boolean getSystemPushNotificationsEnabled() {
        return systemPushNotificationsEnabled;
    }

    public void setSystemPushNotificationsEnabled(Boolean systemPushNotificationsEnabled) {
        this.systemPushNotificationsEnabled = systemPushNotificationsEnabled;
    }

}
