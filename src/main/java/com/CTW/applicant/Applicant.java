package com.CTW.applicant;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Applicant {

    private long id;
    private String name;
    private String prefFirstName;
    private String address;
    private String email;
    private LocalDateTime dateOfBirth;
    private Sex sex;
    private String phone;


    public Applicant(long id, String name, String prefFirstName, String address, String email, LocalDateTime dateOfBirth, String sex, String phone) {
        this.id = id;
        this.name = name;
        this.prefFirstName = prefFirstName;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.sex = Sex.valueOf(sex);
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrefFirstName() {
        return prefFirstName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }
}
