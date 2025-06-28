package com.xworkz.festivo.dto;

public class SingInDTO {
    private String email;
    private String password;

    public SingInDTO(String password, String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "SingInDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
