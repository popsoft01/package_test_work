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

    public static void generateThreeLetterWord(String input){
        String[] newr =  new String[input.length()];
        StringBuilder newString = new StringBuilder();
        int count = 0;
        if (input.length() != 5){
            throw  new IllegalArgumentException("inappropriate String length");
        }else{
            SecureRandom rand = new SecureRandom();
            String[] newInput = input.split("");
            for (int i = 0; i<input.length(); i++){
                newr[i] = newInput[rand.nextInt(newInput.length)];
                for (int k = 0; k < newr.length; k++){
                newString.append(newr[i]);
                count++;
                    System.out.println(Arrays.toString(newr));
                if (count == 3){
                    System.out.println(newString);
                }

                }
            }
            System.out.println(Arrays.toString(newr));
        }

    }

//    public static StringBuilder reverseWord(String[] words){
//
//    }

    public static void main(String[] args) {
        String input = "Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.";
        reverseStringToken(input);
        upperCaseAndLowerCase(input);
        generateThreeLetterWord("thiog");
//        System.out.println( searchChar(input,"t"));

    }
}