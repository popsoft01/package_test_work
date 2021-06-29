package com.ChapterTen.Payroll;



public class WeeklySalary extends Employee {
    private double weeklySalary;

    public WeeklySalary(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName,lastName,SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >0.0){
        this.weeklySalary = weeklySalary;}
        else throw new IllegalArgumentException("invalid salary amount");
    }


    @Override
    public double earning() {
        return 0;
    }

}
