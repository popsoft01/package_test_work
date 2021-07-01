package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class CommissionEmployees extends Employee{

    private double commissionRate;
    private double grossSales;

    public CommissionEmployees(String firstName, String lastName, String ssn, double commissionRate, double grossSale) {
        super(firstName, lastName, ssn, getBirthday());
        if (commissionRate > 0.0 && commissionRate <= 1.0)
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Commission rate is invalid");

        if (grossSale > 0.0)
            this.grossSales = grossSale;
        else throw new IllegalArgumentException("Gross sale must be greater than 0");
    }

    @Override
    public double earning() {
        return getGrossSales() * getCommissionRate();
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0 && commissionRate <= 1.0)
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Commission rate is invalid");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales > 0.0)
            this.grossSales = grossSales;
        else throw new IllegalArgumentException("Gross sale must be greater than 0");
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + " Earning =" + earning();
    }
}
