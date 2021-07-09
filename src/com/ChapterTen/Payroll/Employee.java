package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public abstract class Employee implements Payable{

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthday;

    public Employee(String firstName, String lastName, String ssn,  Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        socialSecurityNumber = ssn;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public abstract double earning();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return socialSecurityNumber;
    }

    public void setDate(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
