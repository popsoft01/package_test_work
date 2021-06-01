package com.ChapterSeven;

import java.util.Arrays;

public class SaleCommission {
    private final int BASED_SALARY = 200;
    private  int weeklyPay;


    public int calculateEarning(int grossSale) {
        weeklyPay = (int) (BASED_SALARY + (grossSale * 0.09));
//        this.weeklyPay = weekPay;
//        System.out.println(weeklyPay);
         return weeklyPay;
    }

    public int getIndex() {
//        System.out.println(weeklyPay);
        return (weeklyPay/100);
    }

    public String assignElementToIndex(int[] commision) {
        if (getIndex() == 2){
            ++commision[0];
        }
        if (getIndex() == 3){
            ++commision[1];
        }
        if (getIndex() == 4){
            ++commision[2];
        }
        if (getIndex() == 5){
            ++commision[3];
        }
        if (getIndex() == 6){
            ++commision[4];
        }
        if (getIndex() == 7){
            ++commision[5];
        }
        if (getIndex() == 8){
            ++commision[6];
        }
        if (getIndex() == 9){
            ++commision[7];
        }
        if (getIndex() <= 10){
            ++commision[9];
        }
        return Arrays.toString(commision);
    }
}
