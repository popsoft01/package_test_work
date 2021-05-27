package com.semicolon.africa.practice;

public class RearrangeNumber {
    public static void main(String[] args) {
        String number = "68573565234";
        StringBuilder buffer = new StringBuilder("68573565");

        buffer.reverse();
        buffer.insert(0,"(+234) ");
        buffer.setCharAt(8,'-');
        buffer.setCharAt(11,'-');

        System.out.println(buffer);

    }

}
