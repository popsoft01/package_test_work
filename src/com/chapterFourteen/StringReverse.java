package com.chapterFourteen;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void reverseStringToken(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder;
        for (String word : words) {
            stringBuilder = new StringBuilder(word);
            System.out.print(stringBuilder.reverse() + " ");
        }
        System.out.println();
    }

    public static void upperCaseAndLowerCase(String input) {
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }

    public static List<Integer> searchChar(String sentence, String character) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (index != -1) {
            if (index != -1) {
                index = sentence.indexOf(character);
                list.add(index);
                index++;
            }
        }
        return list;

    }

    public static void generateThreeLetterWord(String input, int number) {
//        String[] newr = new String[input.length()];
//        String newr ="";
        StringBuilder newString = new StringBuilder(" ");

        if (input.length() != 5) {
            throw new IllegalArgumentException("inappropriate String length");
        } else {
            for (int i = 0; i < input.length() - number + 1; i++) {
                for (int k = i; k < input.length() - number + i; k++) {
                    for (int j = k; j < input.length() - number + k; j++) {
                        if (i != k & i != j & k != j)
                            System.out.println(input.substring(i, 1) + input.substring(k, 1) + input.substring(j, input.length() - j + 1) + " ");
                    }
                }

            }

//            System.out.println(newString);
        }

    }

    public static void main(String[] args) {
        String input = "Write an application that inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.";
        reverseStringToken(input);
        upperCaseAndLowerCase(input);
        generateThreeLetterWord("thing", 3);
//        System.out.println( searchChar(input,"t"));

    }
}