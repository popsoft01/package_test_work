package com.chapterEigteen;

import java.math.BigInteger;

public class BigIntergerFactorial {
    public static BigInteger factorial(BigInteger number){
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(5)));
    }
}
