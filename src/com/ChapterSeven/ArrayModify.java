package com.ChapterSeven;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayModify {
    public static void modifyArrays(int[] arrays) {
        for (int i : arrays)
            arrays[i] *= 2;
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.println(element);
    }

    public static void innitializeTwoDArray(int[][] array) {
        SecureRandom rand = new SecureRandom();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = (1 + rand.nextInt(100));
            }
        }
    }

    public static void gradBook(int[][] arrays, int[] key) {
        int countScors = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] == key[j])
                    countScors++;

            }
        }
    }

    public static void arrayWork(ArrayList<String> item) {
        item.add(0, "love");
        item.add(1, "tada");
        item.add(2, "yhings");
        item.add(3, "hut");
        item.toString();
    }
//    pu
}
