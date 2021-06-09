package com.ChapterEight;
import java.math.BigDecimal;
import java.text.NumberFormat;

class Bigdeecimal {
    public static void princinpalInterst(BigDecimal princinpal, BigDecimal rate){
        princinpal =BigDecimal.valueOf(1000.0);
        rate = BigDecimal.valueOf(0.05);
        for (int year = 0; year < 10; year++){
            BigDecimal amount = princinpal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20%s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }

    }

    public static void main(String[] args) {
//        System.out.println(princinpalInterst(1000.0,0.05));
    }
}
