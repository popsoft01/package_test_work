package com.semicolon.africa.practice;

import java.util.Scanner;

public class CharOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String word = input.nextLine();
        System.out.println("What word are u looking for");
        String search = input.nextLine();
        System.out.println("What char are u looking for");
        char someChar = input.next().charAt(0);

        charOccuranceInString(word, someChar);
        wordOccuranceInString(word, search);


    }

    private static void wordOccuranceInString(String searchWord, String word) {
        String temp[] = word.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The string is: " + searchWord);
        System.out.println("The word " + word + " occurs " + count + " times in the above string");

    }

    private static void charOccuranceInString(String word, char someChar) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println("the character occur " + count + " times");
    }
}