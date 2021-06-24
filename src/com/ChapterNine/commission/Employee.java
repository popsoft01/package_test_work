package com.ChapterNine.commission;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setsocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber.length() != 6)
            throw new UnsupportedOperationException("Social number cannot be less than 6");
        else
            this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getsocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
