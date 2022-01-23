package com.bootcamp.Entities;

import com.bootcamp.Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    private Integer Id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Customer(Integer id, String firstName, String lastName, LocalDate birthDate) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
