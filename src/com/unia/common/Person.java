package com.unia.common;

import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
