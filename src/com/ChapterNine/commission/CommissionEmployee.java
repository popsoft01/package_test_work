package com.ChapterNine.commission;

public class CommissionEmployee extends Employee {


    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }


    public void setGrossSales(double grossSales) {
        if (grossSales > 0.0){
            this.grossSale = grossSales;}
        else throw new IllegalArgumentException("sale must be greater 0.0");
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissiomRate(double commissiomRate) {
        if (commissiomRate >0.0 && commissiomRate <1){
            this.commissionRate = commissiomRate;}
        else
            throw new IllegalArgumentException("commission must be greater 0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earning() {
        return getCommissionRate() * getGrossSale();
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %n %n", getFirstName(), getLastName(),getsocialSecurityNumber(),getGrossSale(),getCommissionRate());
    }
}
