package com.ChapterTen.Payroll;

public class HourlyEmployee extends  Employee {


    private final double hour;
    private final double wage;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hour, double wage) {
        super(firstName, lastName, ssn);
        this.hour = hour;
        this.wage = wage;
    }

    @Override
    public double earning() {
        return 0;
    }
}
