package com.ChapterEight;

public class SavingAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingAccount(double savingsBalance){
        if (savingsBalance <1)
            throw new IllegalArgumentException("Amount must be valid amount");
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate >0.0 && annualInterestRate<1.0){
        SavingAccount.annualInterestRate = annualInterestRate;}
        else
            throw  new IllegalArgumentException("Not a valid interest rate");
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double calculateMonthlyInterest(){
        return savingsBalance * (annualInterestRate/12);
    }

}
