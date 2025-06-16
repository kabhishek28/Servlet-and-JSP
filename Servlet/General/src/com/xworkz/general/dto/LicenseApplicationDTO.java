package com.xworkz.general.dto;

public class LicenseApplicationDTO {

   private String fullName ;
  private   String mobile ;
   private String address ;
   private String appliedDate ;
  private   String vehicleType ;

    @Override
    public String toString() {
        return "LicenseApplicationDTO{" +
                "fullName='" + fullName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", appliedDate='" + appliedDate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    public LicenseApplicationDTO(String fullName, String mobile, String address, String appliedDate, String vehicleType) {
        this.fullName = fullName;
        this.mobile = mobile;
        this.address = address;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
