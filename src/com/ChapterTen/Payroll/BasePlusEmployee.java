package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class BasePlusEmployee extends CommissionEmployees{

    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, String ssn, Date birthday, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, birthday, grossSales, commissionRate);
        if (baseSalary >0.0){
            this.baseSalary = baseSalary;
        }else{
            throw new IllegalArgumentException("Base Salary can't be less than Zero");
        }
    }


    public void setBaseSalary(double baseSalary) {
        if (baseSalary >0.0)
            this.baseSalary = baseSalary;
        else throw new IllegalArgumentException("Base Salary can't be less than Zero");
    }

    public double getBaseSalary() {
        return  baseSalary;
    }

    @Override
    public double earning() {
        return super.earning() + baseSalary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
