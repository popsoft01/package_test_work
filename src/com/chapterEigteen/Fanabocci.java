package com.chapterEigteen;

import java.math.BigInteger;

public class Fanabocci {
    public static BigInteger fanabocci(BigInteger number){
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
            return number;
        else{
            return fanabocci(number.subtract(BigInteger.ONE)).add(fanabocci(number.subtract(BigInteger.TWO)));
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50;i++)
            System.out.println(fanabocci(BigInteger.valueOf(i)));
    }
}
