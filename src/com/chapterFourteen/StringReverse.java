package com.chapterFourteen;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static List<Integer> searchChar(String sentence, String character){
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (index != -1){
            if (index !=-1){
            index = sentence.indexOf(character);
            list.add(index);
            index++;
            }
        }
        return list;

    }

    public static void generateThreeLetterWord(String input) {
//        String[] newr = new String[input.length()];
//        String newr ="";
        StringBuilder newString = new StringBuilder("");
        int count = 0;
        if (input.length() != 5) {
            throw new IllegalArgumentException("inappropriate String length");
        } else {
            for (int i =0; i < input.length(); i++){
                for (int k = 0; k< input.length(); k++){
                    for(int j =0; j<input.length(); j++){
                        newString.append(input, i, 1).append(input, k, 1).append(input, j, 1);
                    }
                }

            }

            System.out.println(newString);
        }

    }
    public static void main(String[] args) {
        String input = "Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.";
        reverseStringToken(input);
        upperCaseAndLowerCase(input);
        generateThreeLetterWord("thing");
//        System.out.println( searchChar(input,"t"));

    }
}