package com.ChapterNine.commission;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        if (baseSalary > 0.0) {
            this.baseSalary = baseSalary;
        } else throw new IllegalArgumentException("invalid input");
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0.0) {
            this.baseSalary = baseSalary;
        } else throw new IllegalArgumentException("invalid input");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earning() {
        return getBaseSalary() * super.earning();
    }

    @Override
    public String toString() {
        return String.format("%s %s %n %n", getFirstName(), getLastName(), getBaseSalary(), earning());
    }

}
