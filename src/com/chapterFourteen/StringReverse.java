package com.chapterFourteen;


import java.util.Locale;

public class StringReverse {
    public static void reverseStringToken(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder;
        for (String word : words){
            stringBuilder = new StringBuilder(word);
            System.out.print(stringBuilder.reverse() + " ");
        }
        System.out.println();
    }

    public static void upperCaseAndLowerCase(String input){
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }

//    public static StringBuilder reverseWord(String[] words){
//
//    }

    public static void main(String[] args) {
        String input = "Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.";
        reverseStringToken(input);
        upperCaseAndLowerCase(input);
    }
}