package com.ChapterTen.Payroll;

public class CommissionEmployees extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployees(String firstName, String lastName, String ssn, double commissionRate, double grossSale) {
        super(firstName, lastName, ssn);
        if (commissionRate > 0.0 && commissionRate <= 1.0)
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Commission rate is invalid");
    }

    @Override
    public double earning() {
        return 0;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0 && commissionRate <= 1.0)
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Commission rate is invalid");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double commissionRate) {
        if (commissionRate > 0.0)
            this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }
}
