package com.xworkz.general.dto;

public class JobApplicationDTO {
    private String name;
    private  String email;
    private String education;
    private String skill;
    private double salary;
    private int experience;

    @Override
    public String toString() {
        return "jobApplicationDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
