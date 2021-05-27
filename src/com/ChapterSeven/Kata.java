package com.ChapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Kata {
    public void shuffle(int[] arrays) {
        SecureRandom rand = new SecureRandom();
        int temp = 0;
        for (int i = arrays.length-1 ; i > 0; i--){

            int randomIndex = rand.nextInt(arrays.length-1);
            temp = arrays[randomIndex];
            arrays[randomIndex] = arrays[i];
           arrays[i] = temp;

            System.out.print(temp +" ");
        }
//    r   System.out.println(temp);
//        return temp;
    }
    public void shuffle2(int[] number){
        Random rand = ThreadLocalRandom.current();
        for (int i = 0; i < number.length; i++) {
            int randomIndexToSwap = rand.nextInt(number.length);
            int temp = number[i];
            number[i] = number[randomIndexToSwap];
            number[randomIndexToSwap] = temp;
            System.out.print(number[randomIndexToSwap]+" ");
        }
    }
    public void shuffle3(int[] number){
//        int temp = 0;
        int secondNumber = 0;
        SecureRandom rand = new SecureRandom();

        for (int i = 0; i < number.length; i++) {
           int temp = number[i];
            secondNumber = rand.nextInt(number.length);
            temp = number[secondNumber];
            number[secondNumber] = temp;
            temp = secondNumber;


            System.out.print(temp + " ");

        }


//        int numberOne =0;
//        int numberThree =0;
//        int
//       SecureRandom rand = new SecureRandom();
////        SecureRandom pot = new SecureRandom();
//
//        int numberTwo= rand.nextInt(number.length);
////        int temp = rand.nextInt(number.length);
//
//        for (int i = 0; i<number.length; i++){
//
//            temp = numberOne;
//            numberTwo = numberThree;
//            numberOne = numberThree;
//            numberThree = numberTwo;
//            temp = numberOne;
//            System.out.println(temp);
//        }
    }

    public void sortNum(int[] arrays) {

        int currentIndex = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j =i+1; j<arrays.length;j++){
            if(arrays[i] > arrays[j]){;
            currentIndex = arrays[i];
            arrays[i] = arrays[j];

           arrays[j] = currentIndex; }
        }
    }

    }
    public void decreaseSortNum(int[] arrays) {

        int currentIndex = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j =i+1; j<arrays.length;j++){
                if(arrays[j] > arrays[i]){;
                    currentIndex = arrays[j];
                    arrays[j] = arrays[i];

                    arrays[i] = currentIndex; }
            }
        }

//    public int[] sort(int[] arrays) {
//    }
//    }

}
    public void shuffleWithTwoRandom(int[] arrays){
        SecureRandom rand = new SecureRandom();
        int randomOne = 0;
        int randomTwo = 0;
        int temp = 0;
        for (int i = 0; i<arrays.length; i++){
            randomOne = 1 + rand.nextInt(arrays.length-1);
            randomTwo = 1 + rand.nextInt(arrays.length-1);
            temp = arrays[randomOne];
            arrays[randomOne] = arrays[randomTwo];
            arrays[randomTwo] = temp;
        }
}
    public int dieRoll(){
        SecureRandom rand = new SecureRandom();
        int dieOne  = 1+ rand.nextInt(6);
//        int dieTwo =1 + rand.nextInt(6);
        System.out.println("the generated number are: " + dieOne);
        return dieOne;
    }

    public  void loopDie(int numberOftim){
        int[] frquency = new int[7];
        for (int i=0; i < numberOftim; i++){
            ++frquency[dieRoll()];
        }
        System.out.println(Arrays.toString(frquency));
    }
    public void copyArrays(int[] array){
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.out.println(Arrays.toString(newArray));
    }
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n2+" "+n1+"  "+temp);
    }
//    public char[] charArray(char[] chars){
//        SecureRandom random = new SecureRandom();
//        for (int i =0; i< chars.length;i++){
//            chars[i] = Ramdom
//        }
//    }

}
