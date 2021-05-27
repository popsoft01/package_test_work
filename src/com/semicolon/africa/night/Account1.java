package com.semicolon.africa.night;

public class Account1 {
    private String name;
    private double balance;

    public Account1(String name, double balance) {
        this.name = name;

        if( balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double deposit(double amount){
        if (amount > 0){
            balance += amount;}
        return balance;
    }
}
