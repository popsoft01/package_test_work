package com.ChapterEight.payroll;

import com.ChapterEight.Date;

public class Employee {
        private String firstName;
        private String lastName;
        private Date birthDate;
        private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }

    public static void main(String[] args) {
        Date date = new Date(02,23,1993);
        Date hireDate = new Date(3,5,2018);
        Employee employee = new Employee("Tunde","Popoola",date,hireDate);
        System.out.println(employee);
    }
}
