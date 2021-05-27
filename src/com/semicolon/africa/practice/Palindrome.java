package com.semicolon.africa.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word");
        String word = input.nextLine();
        System.out.println(word);
        StringBuilder sb = new StringBuilder(word);
        StringBuilder rev = sb.reverse();
        if (word.equals(String.valueOf(rev))){
            System.out.println("it is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }

}
