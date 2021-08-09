package com.chapterFourteen;


public class StringReverse {
    public static void reverseStringToken(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder;
        for (String word : words){
            stringBuilder = new StringBuilder(word);
            System.out.print(stringBuilder.reverse() + " ");}

    }

//    public static StringBuilder reverseWord(String[] words){
//
//    }

    public static void main(String[] args) {
        reverseStringToken("Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.");
    }
}