package com.ChapterEight;

import java.time.Month;

public class SavingAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingAccount(double savingsBalance){
        if (savingsBalance < 1)
            throw new IllegalArgumentException("Amount must be valid amount");
        else this.savingsBalance = savingsBalance;

//        System.out.println(savingsBalance);
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
//        System.out.println(saving);
      return   savingsBalance += saving;
    }

    public String toString(){
        return String.format("%.2f%n",savingsBalance);
    }


    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(200);
//        SavingAccount account2 = new SavingAccount(3000.0);

        setAnnualInterestRate(0.04);
//        account.setSavingsBalance(2000.0);
//        account.calculateMonthlyInterest();
//        account2.calculateMonthlyInterest();
//        account.calculatedSavingforMonth();

        for(int i = 1; i <=12; i++){
            System.out.printf("%s-%d%8.2f%n","month",i, account.calculatedSavingforMonth());
        }

    }

}
