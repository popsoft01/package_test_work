package com.ChapterSeventeen;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySimplifyWithLamdas {
    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        printSorted(values);
        printElementOfgreaterthan4(values);
    }

    private static PrintStream printSorted(Integer[] values) {
        return System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
//                IntStream.of(values)
                        .sorted()
                        .collect(Collectors.toList()));
    }
    public static void printElementOfgreaterthan4(Integer[] values){
       List<Integer> greaterThanfour = Arrays.stream(values)
                .filter(value -> value > 4)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(greaterThanfour);

        System.out.println( greaterThanfour.stream().sorted().collect(Collectors.toList()));
    }
}
