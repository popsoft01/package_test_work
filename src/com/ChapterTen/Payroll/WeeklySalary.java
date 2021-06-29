package com.ChapterTen.Payroll;



public class WeeklySalary extends Employee {
    public WeeklySalary(String firstName, String lastName, String SSN) {
        super(firstName,lastName,SSN);
    }

    @Override
    public double earning() {
        return 0;
    }
}
