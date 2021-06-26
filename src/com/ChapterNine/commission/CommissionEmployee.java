package com.ChapterNine.commission;

public class CommissionEmployee extends Employee {


    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSale > 0.0){
            this.grossSale = grossSale;}
        else throw new IllegalArgumentException("sale must be greater 0.0");

        if (commissionRate >0.0 && commissionRate <1){
            this.commissionRate = commissionRate;}
        else
            throw new IllegalArgumentException("commission must be greater 0.0");

    }


    public void setGrossSales(double grossSale) {
        if (grossSale > 0.0){
            this.grossSale = grossSale;}
        else throw new IllegalArgumentException("sale must be greater 0.0");
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissiomRate(double commissionRate) {
        if (commissionRate >0.0 && commissionRate <1){
            this.commissionRate = commissionRate;}
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
