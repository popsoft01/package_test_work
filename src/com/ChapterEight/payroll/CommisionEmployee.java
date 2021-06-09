package com.ChapterEight.payroll;

public class CommisionEmployee {
    private String firstname;
    private  String lastname;
    private String ssn;
    private double commisionRate;
    private double grossSaleAmount;

    public CommisionEmployee(String firstname, String lastname, String ssn, double commisionRate, double grossSaleAmount) {

        if (grossSaleAmount <0.0)
            throw new IllegalArgumentException("Gross sales must be >=0.0");

        if (commisionRate <= 0.0 || commisionRate >= 1.0)
            throw new IllegalArgumentException("Commision rate must be >0.0 and >1.0");

        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.commisionRate = commisionRate;
        this.grossSaleAmount = grossSaleAmount;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        if (commisionRate <0.0 || commisionRate >1.0)
            throw  new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");
        this.commisionRate = commisionRate;
    }

    public double getGrossSaleAmount() {
        return grossSaleAmount;
    }

    public void setGrossSaleAmount(double grossSaleAmount) {
        if (grossSaleAmount < 0.0)
            throw new IllegalArgumentException("Gross sale must be > 0.0");
        this.grossSaleAmount = grossSaleAmount;
    }

    public double earning(){
        return commisionRate * grossSaleAmount;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee",firstname,lastname,"social security number",ssn,"gross sales",grossSaleAmount,"commission rate",commisionRate);
    }
}
