package com.xworkz.general.dto;

public class DeathApplicationDTO {
   private String fullName ;
    private  String gender ;
    private  String age ;
    private  String dateOfDeath;
    private  String timeOfDeath ;
    private  String causeOfDeath ;
    private  String mannerOfDeath ;
    private  String certifiedBy ;
    private  String hospitalName ;
    private  String identificationMarks ;


    public DeathApplicationDTO(String fullName, String gender, String age, String dateOfDeath, String timeOfDeath, String causeOfDeath, String mannerOfDeath, String certifiedBy, String hospitalName, String identificationMarks) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.dateOfDeath = dateOfDeath;
        this.timeOfDeath = timeOfDeath;
        this.causeOfDeath = causeOfDeath;
        this.mannerOfDeath = mannerOfDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.identificationMarks = identificationMarks;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getTimeOfDeath() {
        return timeOfDeath;
    }

    public void setTimeOfDeath(String timeOfDeath) {
        this.timeOfDeath = timeOfDeath;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getIdentificationMarks() {
        return identificationMarks;
    }

    public void setIdentificationMarks(String identificationMarks) {
        this.identificationMarks = identificationMarks;
    }
}
