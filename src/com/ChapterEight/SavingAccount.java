package com.ChapterEight;

import java.time.Month;

public class SavingAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingAccount(double savingsBalance){
        if (savingsBalance <1)
            throw new IllegalArgumentException("Amount must be valid amount");
        System.out.println(annualInterestRate);
        System.out.println(this.savingsBalance);
        System.out.println(savingsBalance);
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
        return savingsBalance * (SavingAccount.annualInterestRate/12);
    }
    public double calculatedSavingforMonth(){
        double saving = calculateMonthlyInterest();
      return   savingsBalance += saving;
    }

    public String toString(){
        return String.format("%.2f%n",savingsBalance);
    }


    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(2000.0);
        SavingAccount account2 = new SavingAccount(3000.0);
        setAnnualInterestRate(0.04);
        for(int i = 0; i < 12; i++){
            System.out.printf("%s%5.2f%n","month", account.calculatedSavingforMonth());
        }

    }

}
