package com.ChapterSeventeen;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class LamdasRead {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.println("Orignal values: ");
        IntStream.of(values).forEach(x -> System.out.printf("%d ",x));

    }
}

