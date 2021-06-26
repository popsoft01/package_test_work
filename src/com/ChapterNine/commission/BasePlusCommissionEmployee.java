package com.ChapterNine.commission;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate,double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        if (baseSalary > 0.0){
            this.baseSalary = baseSalary;
        }
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
