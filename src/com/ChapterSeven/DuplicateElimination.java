package com.ChapterSeven;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DuplicateElimination {
//    int[] duplicate = new int[5];

    public int numberGenerator() {
        Random rand = new Random();
        int number = 10 + rand.nextInt(10);
        return number;
    }

    public void appendMethod(int[] duplicate) {
//        duplicate = new int[5];
//         this.duplicate = duplicate;
        Random rand = new Random();
        int i = 0;
        for (; i < duplicate.length; i++) {
            duplicate[i] = numberGenerator();
//            System.out.print(duplicate[i] + " ");
        }
//        Arrays.sort(duplicate);
    }

    public int removeDuplicate(int[] array) {
//        if(number <0||number==0)
//            return number;

        int[] temp = new int[array.length];
        Arrays.sort(array);
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i++]) {
                temp[newIndex++] = array[i];
            }
            temp[newIndex++] = array[i -1];
            for (int k = 0; k < newIndex; k++){
                array[k] = temp[k]; }
        }
        System.out.println(newIndex);
        return newIndex;
    }

//    public void inputDuplicaRemover(int[] array) {
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i < array.length; i++) {
////            array[i] = number;
//            System.out.println("pls enter a number");
//            int number = input.nextInt();
////            array[i] = number;
//            isUnique(array, number);
//            System.out.println(Arrays.toString(array));
//        }
//    }

    public boolean isUnique(int[] array, int number) {
        for (int j = 0; j <= array.length - 1; j++) {
            if (array[j] == number){
//                System.out.println(Arrays.toString(array));
                return true;
            }
//              number = input.nextInt();
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = new int[5];
        DuplicateElimination duplicate = new DuplicateElimination();
        Scanner input = new Scanner(System.in);
        int number;
        for (int i = 0; i < array.length; i++){
        number = input.nextInt();
        if (!duplicate.isUnique(array,number)){
            array[i] = number;
        }else{
            System.out.println("invalid input");
        }
            for (int count : array) {
                if (count != 0) {
                    System.out.println(count);
                }
            }
        }


//        duplicate.inputDuplicaRemover(array);
        System.out.println(Arrays.toString(array));
    }

}
