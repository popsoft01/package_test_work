package com.chapterSixteen;

import java.util.Arrays;
import java.util.TreeSet;

public class SortTreeSet {
    public static void sort(String input) {
        String[] newString = input.split(" ");
        TreeSet<String> sets = new TreeSet<>(Arrays.asList(newString));
//        for (int i = 0; i < sets.size(); i++) {
        System.out.println(sets);
//        }
    }

    public static void main(String[] args) {
        sort("actors. Remember that a prime number’s factors are only 1 and the prime number itself. Every");
    }

}
