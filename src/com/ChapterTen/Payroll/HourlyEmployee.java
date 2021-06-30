package com.ChapterTen.Payroll;

public class HourlyEmployee extends  Employee {


    private final double hour;
    private final double wage;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hour, double wage) {
        super(firstName, lastName, ssn);
        if (hour >= 0.0){
        this.hour = hour;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");
        if (hour >= 0.0){
            this.wage = wage;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");

    }

    @Override
    public double earning() {
        return 0;
    }
}
