package com.ChapterTen.Payroll;


import com.ChapterEight.Date;

public class SalaryEmployee extends Employee {
    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, String ssn, Date birthday) {
        super(firstName, lastName, ssn, birthday);
        if (weeklySalary > 0.0){
            this.weeklySalary = weeklySalary;}
        else throw new IllegalArgumentException("invalid salary amount");

    }

    @Override
    public double earning() {
        return weeklySalary;
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
    public String toString() {
        return String.format("%s %s :  %n",getFirstName(),getLastName(),earning());
    }
}
