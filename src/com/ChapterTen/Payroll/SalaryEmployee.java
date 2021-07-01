package com.ChapterTen.Payroll;



public class SalaryEmployee extends Employee {
    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName,lastName,SSN, birthday);
        if (weeklySalary >0.0){
            this.weeklySalary = weeklySalary;}
        else throw new IllegalArgumentException("invalid salary amount");
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
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %n",getFirstName(),getLastName(),earning());
    }
}
