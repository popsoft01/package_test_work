package com.chapterSixteen;

import java.util.Arrays;
import java.util.TreeSet;

public class SortTreeSet {
    public static void Sort(String input) {
        String[] newString = input.split("");
        TreeSet<String> sets = new TreeSet<>(Arrays.asList(newString));
        for (int i = 0; i < sets.size(); i++) {
            System.out.println(sets);
        }
    }

    public static void main(String[] args) {
        System.out.println("actors. Remember that a prime number’s factors are only 1 and the prime number itself. Every");
    }

}
