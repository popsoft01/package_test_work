package com.ChapterNine.commission;

public class HourlyEmployee extends Employee {


    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if (hour > 0.0 && hour < 168){
            this.hour = hour;}
        else
            throw new IllegalArgumentException("Hour can not be less than Zero");

        if (hour > 0.0){
            this.wage = wage;}
        else
            throw new IllegalArgumentException("Wage can not be less than Zero");

    }

    public void setHour(double hour) {
        if (hour > 0.0 && hour < 168){
            this.hour = hour;}
        else
            throw new IllegalArgumentException("Hour can not be less than Zero");
    }

    public double getHour() {
        return hour;
    }

    public void setWage(double wage) {
        if (wage > 0.0){
            this.wage = wage;}
        else
            throw new IllegalArgumentException("Wage can not be less than Zero");
    }

    public double getWages() {
        return wage;
    }

    public double earnings() {
        return getHour() * getWages();
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %n",getFirstName(),getLastName(),getsocialSecurityNumber(),earnings());
    }
}
