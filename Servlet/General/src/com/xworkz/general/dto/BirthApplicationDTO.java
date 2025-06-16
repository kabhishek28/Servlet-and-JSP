package com.xworkz.general.dto;

public class BirthApplicationDTO {
    private String birthID;
    private String fatherName;
    private String motherName;
    private String datetime;
    private String doctorName;
    private String nurseName;
    private String hospitalName;
    private String hospitaltype;

    @Override
    public String toString() {
        return "BirthApplicationDTO{" +
                "birthID='" + birthID + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", datetime='" + datetime + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitaltype='" + hospitaltype + '\'' +
                '}';
    }



    public BirthApplicationDTO(String birthID, String fatherName, String motherName, String datetime, String doctorName, String nurseName, String hospitalName, String hospitaltype) {
        this.birthID = birthID;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.datetime = datetime;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalName = hospitalName;
        this.hospitaltype = hospitaltype;
    }

    public String getBirthID() {
        return birthID;
    }

    public void setBirthID(String birthID) {
        this.birthID = birthID;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitaltype() {
        return hospitaltype;
    }

    public void setHospitaltype(String hospitaltype) {
        this.hospitaltype = hospitaltype;
    }
}
