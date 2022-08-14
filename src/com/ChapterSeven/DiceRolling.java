package com.ChapterSeven;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    static Random generator = new Random();
    private static int numberOne;
    private static int numberTwo;


    public static void dieRoll() {
        DiceRolling.numberOne = 1 + generator.nextInt(6);
    }

    public static void dieRollTwo() {
        DiceRolling.numberTwo = 1 + generator.nextInt(6);
    }

    public static int sumRandomNumber() {
        dieRoll();
        dieRollTwo();
        return DiceRolling.numberOne + DiceRolling.numberTwo;
    }


    public static String assignArray(int[] dice) {

        for (int count = 0; count < 36000; count++) {
//            int random = sumRandomNumber();
            if (sumRandomNumber() == 2)
                ++dice[0];
        }
        if (sumRandomNumber() == 3) {
            ++dice[1];
        }
        if (sumRandomNumber() == 4) {
            ++dice[2];
        }
        if (sumRandomNumber() == 5) {
            ++dice[3];
        }
        if (sumRandomNumber() == 6) {
            ++dice[4];
        }
        if (sumRandomNumber() == 7) {
            ++dice[5];
        }
        if (sumRandomNumber() == 8) {
            ++dice[6];
        }
        if (sumRandomNumber() == 9) {
            ++dice[7];
        }
        if (sumRandomNumber() == 10) {
            ++dice[8];
        }
        if (sumRandomNumber() == 11) {
            ++dice[9];
        }
        if (sumRandomNumber() == 12) {
            ++dice[10];
        }
        System.out.println(Arrays.toString(dice));
        return "hello";
    }

    public static void printGrid() {


    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        DiceRolling.assignArray(arr);
    }
//        int i = 0;
//        for (; i < 36000; i++) {
////            switch (sumRandomNumber()) {
//            if (sumRandomNumber() == 2) {
//                ++dice[0];
//                System.out.println(Arrays.toString(dice));
//            }
//            if (sumRandomNumber() == 3) {
//                ++dice[1];
//            }
//            if (sumRandomNumber() == 4) {
//                ++dice[2];
//            }
//            if (sumRandomNumber() == 5){
//                ++dice[3];
//            }
//            if (sumRandomNumber() == 6){
//                ++dice[4];
//            }
//            if (sumRandomNumber() == 7){
//                ++dice[5];
//            }
//            if (sumRandomNumber() == 8){
//                ++dice[6];
//            }
//            if (sumRandomNumber() == 9){
//                ++dice[7];
//            }
//            if (sumRandomNumber() == 10){
//                ++dice[8];
//            }
//            if (sumRandomNumber() == 11){
//                ++dice[9];
//            }
//            if (sumRandomNumber() == 12){
//                ++dice[10];
//            }
//                case 2 -> ++dice[0];
//                case 3 -> ++dice[1];
//                case 4 -> ++dice[2];
//                case 5 -> ++dice[3];
//                case 6 -> ++dice[4];
//                case 7 -> ++dice[5];
//                case 8 -> ++dice[6];
//                case 9 -> ++dice[7];
//                case 10 -> ++dice[8];
//                case 11 -> ++dice[9];
//                case 12 -> ++dice[10];
//                default -> {
//                }
//        }
//        }
//        System.out.println(Arrays.toString(dice));
//        return Arrays.toString(dice);
//    }
//    }
}