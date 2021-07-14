package com.chapterFourteen;

public class RegionMatchClass {
    public static void main(String[] args) {
        String firstString = "Hay!!! Why are you here";
        String secondString = "Hay!!! why are you sleeping" ;
       if (firstString.regionMatches(0,secondString,0,0)){
            System.out.println("First 5 characters of firstString and SecondString match");}
       else
            System.out.println(
                    "First 5 characters of firstString and SecondString do not match");
        }

}