package com.ChapterTen.Payroll;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        socialSecurityNumber = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s",firstName,lastName,socialSecurityNumber);
    }
    public abstract double earning();
}
