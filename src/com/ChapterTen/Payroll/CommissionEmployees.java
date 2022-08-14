package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class CommissionEmployees extends Employee {

    private double commissionRate;
    private double grossSales;

    public CommissionEmployees(String firstName, String lastName, String ssn, Date birthday, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn, birthday);
        if (commissionRate > 0.0 && commissionRate < 1.0) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        if (grossSales >= 0.0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
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
