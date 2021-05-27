package com.semicolon.africa.night;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Account name");
        String name = input.nextLine();
        Account1 myAccount = new Account1(name, 400.00);

        System.out.println(myAccount.getName());

    }

}
