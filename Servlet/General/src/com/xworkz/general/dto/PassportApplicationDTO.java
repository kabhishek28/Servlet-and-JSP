package com.xworkz.general.dto;

public class PassportApplicationDTO {
    private String applicantName ;
    private String adharName ;
    private String panName ;
    private String passporttypeName ;
    private String addressName ;
    private String countryName ;
    private  String stateName ;
    private  String cityName ;
    private String pinName ;
    private String paymentName ;

    @Override
    public String toString() {
        return "PassportApplicationDTO{" +
                "applicantName='" + applicantName + '\'' +
                ", adharName='" + adharName + '\'' +
                ", panName='" + panName + '\'' +
                ", passporttypeName='" + passporttypeName + '\'' +
                ", addressName='" + addressName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", pinName='" + pinName + '\'' +
                ", paymentName='" + paymentName + '\'' +
                '}';
    }

    public PassportApplicationDTO(String applicantName, String adharName, String panName, String passporttypeName, String addressName, String countryName, String stateName, String cityName, String pinName, String paymentName) {
        this.applicantName = applicantName;
        this.adharName = adharName;
        this.panName = panName;
        this.passporttypeName = passporttypeName;
        this.addressName = addressName;
        this.countryName = countryName;
        this.stateName = stateName;
        this.cityName = cityName;
        this.pinName = pinName;
        this.paymentName = paymentName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getAdharName() {
        return adharName;
    }

    public void setAdharName(String adharName) {
        this.adharName = adharName;
    }

    public String getPanName() {
        return panName;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    public String getPassporttypeName() {
        return passporttypeName;
    }

    public void setPassporttypeName(String passporttypeName) {
        this.passporttypeName = passporttypeName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPinName() {
        return pinName;
    }

    public void setPinName(String pinName) {
        this.pinName = pinName;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }
}
