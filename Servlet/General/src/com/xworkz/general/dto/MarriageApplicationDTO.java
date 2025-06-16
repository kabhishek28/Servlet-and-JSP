package com.xworkz.general.dto;

public class MarriageApplicationDTO {

   private String groomName  ;
   private String brideName ;
   private String location ;
   private String religion ;
   private String address ;
   private String marriageDate ;
   private String officerPresent ;
   private String witness1 ;
   private String witness2 ;

    public MarriageApplicationDTO(String groomName, String brideName, String location, String religion, String address, String marriageDate, String officerPresent, String witness1, String witness2) {
        this.groomName = groomName;
        this.brideName = brideName;
        this.location = location;
        this.religion = religion;
        this.address = address;
        this.marriageDate = marriageDate;
        this.officerPresent = officerPresent;
        this.witness1 = witness1;
        this.witness2 = witness2;
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(String marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getOfficerPresent() {
        return officerPresent;
    }

    public void setOfficerPresent(String officerPresent) {
        this.officerPresent = officerPresent;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }
}
