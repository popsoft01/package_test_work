package com.ChapterTen.Payroll;

public class HourlyEmployee extends  Employee {


    private double hour;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String ssn, double hour, double wage) {
        super(firstName, lastName, ssn);
        if (hour >= 0.0){
        this.hour = hour;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");
        if (hour >= 0.0){
            this.wage = wage;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");

    }

    public void setHour(double hour) {
        if (hour >= 0.0){
            this.hour = hour;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");
    }

    public double getHour() {
        return hour;
    }

    public void setWage(double wage) {
        if (hour >= 0.0){
            this.wage = wage;}
        else throw new IllegalArgumentException("Hour cannot be less than zero");

    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earning() {
        double hourWage= 0;
        if (hour <= 40)
            hourWage = wage * hour;
        else if (hour > 40)
            hourWage = 40 * wage + (hour - 40) * wage * 1.5;
        return hourWage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hour=" + hour +
                ", wage=" + wage + " earning =" + earning() + " }";
    }
}
