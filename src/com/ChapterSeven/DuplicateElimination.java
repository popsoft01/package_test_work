package com.ChapterSeven;

import java.util.Arrays;
import java.util.Random;

public class DuplicateElimination {
    int[] duplicate = new int[5];

    public int numberGenerator() {
        Random rand = new Random();
       int number = 10 + rand.nextInt(10);
        return number;
    }

    public void appendMethod(int[] duplicate){
//        duplicate = new int[5];
//         this.duplicate = duplicate;
        Random rand = new Random();
        int i = 0;
        for ( ;i < duplicate.length; i++){
            duplicate[i] = numberGenerator();
//            System.out.print(duplicate[i] + " ");
        }
        Arrays.sort(duplicate);
    }
    public void removeDuplicate(int[] array){
//        if(n <0||n==0);
        int[] temp = new int[array.length];
        Arrays.sort(array);
        int j = 0;
        for(int i = 0; i< array.length;i++){
            if(array[i] != array[i++]){
                temp[j++] = array[i];
            }
            temp[j++] = array[i-1];
            for (int k = 0; k < j; k++)
                array[k] = temp[k];
        }


    }
}
