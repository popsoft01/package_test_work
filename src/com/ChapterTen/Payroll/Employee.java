package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthday;

    public Employee(String firstName, String lastName, String ssn,  Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        socialSecurityNumber = ssn;
        this.birthday = birthday;
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
        return String.format("%s %s %s %s",firstName,lastName,socialSecurityNumber,birthday);
    }
    public abstract double earning();

    public void setDate(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public static void main(String[] args) {
        Date birthday = new Date(02,04,1994);
        System.out.println(birthday);
    }
}
