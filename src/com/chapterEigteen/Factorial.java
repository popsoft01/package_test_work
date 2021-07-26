package com.chapterEigteen;

public class Factorial {
    public static long factorial(int number){
        if (number == 0 || number ==1){
            return 1;
        }else {
            number *= factorial(number-1);
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println( factorial(5));
    }

}
