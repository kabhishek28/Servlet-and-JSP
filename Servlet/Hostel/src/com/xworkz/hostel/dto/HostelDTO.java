package com.xworkz.hostel.dto;

public class HostelDTO {
    private String name;
    private String email;
    private String phoneno;
    private String address;
    private String college;
    private String gender;
    private int age;
    private boolean check;

    public HostelDTO(String name, String email, String phoneno, String address, String college, String gender, int age, boolean check) {
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.address = address;
        this.college = college;
        this.gender = gender;
        this.age = age;
        this.check = check;
    }

    @Override
    public String toString() {
        return "HostelDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", address='" + address + '\'' +
                ", college='" + college + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", check=" + check +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
