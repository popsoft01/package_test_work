package com.charpterFour.africa;

import java.util.Scanner;

public class Factorial {
    public int calculateFactorial(int number) {
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

//    public static void main(String[] args) {
//        Factorial fact = new Factorial();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = input.nextInt();
//        int factorial = fact.calculateFactorial(number);
//        System.out.println("the factorial of " + number + " is "+ factorial);
//    }

}
