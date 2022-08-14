package com.chapterSixteen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElimination {
    public static String dublicateElimination() {
        Set<String> names = new HashSet<>();
        String[] input = {"ola", "olu", "ola", "bola", "tope", "tope", "dada"};
//        for (int i = 0; i< input.length; i++){

        names.addAll(Arrays.asList(input));

        System.out.println("the size of the set is " + names.size());
        System.out.println(names.isEmpty());
        return names.toString();
    }

    public static void main(String[] args) {
        System.out.println(dublicateElimination());
    }
}
