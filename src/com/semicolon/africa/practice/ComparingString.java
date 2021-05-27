package com.semicolon.africa.practice;

import java.util.Scanner;

public class ComparingString {

    public static int compareString(String firstString, String secondString) {
        //        if (value < 0){
//            System.out.println(firstString + " is less than "+ secondString);
//        }else
//            System.out.println((firstString + " is greater than "+ secondString));
        return firstString.compareTo(secondString);
    }


    public static boolean regoinMatchCompare(String firstString, String secondString) {
        return firstString.regionMatches(true,0,secondString,0,12);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the first String");
        String firstString = input.nextLine();
        System.out.println("enter the first String");
        String secondString = input.nextLine();
        int value = compareString(firstString, secondString);
        if (value < 0){
            System.out.println(firstString + " is less than "+ secondString);
        }else if(value > 0)
            System.out.println((firstString + " is greater than "+ secondString));
        else
            System.out.println("its equal word");

    }
}
