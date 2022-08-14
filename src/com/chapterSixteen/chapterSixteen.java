package com.chapterSixteen;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class chapterSixteen {
    public static Set<String> duplicateWords(String input) {

        if (input == null || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();

        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();

        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        String test = "This sentence contains two words, one and two, one";
        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);
    }

}

