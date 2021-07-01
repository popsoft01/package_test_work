package com.ChapterTen.Payroll;

public class BasePlusEmployee extends CommissionEmployees{

    private double baseSalary;

    public BasePlusEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSale, double baseSalary) {
        super(firstName, lastName, ssn, commissionRate, grossSale);
        if (baseSalary >0.0)
            this.baseSalary = baseSalary;
        else throw new IllegalArgumentException("Base Salary can't be less than Zero");
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
        return super.toString();
    }
}
