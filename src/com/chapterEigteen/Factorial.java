package com.chapterEigteen;

public class Factorial {
    public static long factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            number *= factorial(number - 1);
        }
        return number;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(factorial(i));
        }
    }

}
