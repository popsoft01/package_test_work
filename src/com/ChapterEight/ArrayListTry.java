package com.ChapterEight;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        ArrayList<Integer> list = new ArrayList<>(10);
        do {
            System.out.println("Enter a unique number");
            number = input.nextInt();

            if (!list.contains(number) && number != 0) {
                list.add(number);
            }

        } while (number != 0);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
