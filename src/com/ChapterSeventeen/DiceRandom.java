package com.ChapterSeventeen;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DiceRandom {
   static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        random.ints(10_000,1,7)
//                .sorted()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)->System.out.printf("%-6d%d%n", face, frequency));
    }
}
