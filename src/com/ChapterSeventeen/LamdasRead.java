package com.ChapterSeventeen;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class LamdasRead {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        printStream(values);
        System.out.println();
        checkSize(values);
        System.out.println();
        checkMin(values);
        checkMax(values);
        checkAvarage(values);
        checkReduceOne(values);

    }

    private static void printStream(int[] values) {
        System.out.println("Orignal values: ");
        IntStream.of(values).forEach(element -> System.out.printf("%d ",element));
    }
    public static void checkSize(int[] values){
        System.out.println("Array size " + IntStream.of(values).count());
    }
    public static void checkMin(int[] values){
        System.out.println("Array size " + IntStream.of(values).min().getAsInt());
    }
    public static void checkMax(int[] values){
        System.out.println("Array size " + IntStream.of(values).max().getAsInt());
    }
    public static void checkAvarage(int[] values){
        System.out.println("Array size " + IntStream.of(values).average().getAsDouble());
    }
    public static void checkReduceOne(int[] values){
        System.out.println("Array size " + IntStream.of(values).reduce(0, Integer::sum));
    }
    public static void checkReduceTwo(int[] values){
        System.out.println("Array size " + IntStream.of(values).reduce(0, (x,y)->x*y));
    }

}
