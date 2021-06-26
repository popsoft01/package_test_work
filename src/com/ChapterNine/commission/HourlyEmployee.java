package com.ChapterNine.commission;

public class HourlyEmployee extends Employee {


    private double hour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }
}
