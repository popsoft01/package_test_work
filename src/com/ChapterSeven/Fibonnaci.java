package com.ChapterSeven;

import java.util.Arrays;

public class Fibonnaci {
    public static String fibonnaciSeries(int n) {
        if (n == 0 || n == 1)
//                return 1;
            ;
        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        for (int i = 2; i < fibSeries.length; i++) {
//            System.out.println(i);
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            System.out.println(fibSeries[i]);
        }
        return Arrays.toString(fibSeries);
    }
//    public String toString(){
//        return String.format();
//    }

    //    public static String fibonacciSeries(int n) {
//        int[] fibSeries = new int[n];
//        fibSeries[0] = 0;
//        fibSeries[1] = 1;
//
//        for (int count = 2; count < fibSeries.length; count++){
//            fibSeries[count] = fibSeries[count - 2] + fibSeries[count - 1];
//        }
//
//        return Arrays.toString(fibSeries);
//    }
    public static void main(String[] args) {
//        Fibonnaci fid = new Fibonnaci();
        System.out.println(Fibonnaci.fibonnaciSeries(20));


        int[] fibSeries = new int[5];
        System.out.println(Arrays.toString(fibSeries));
    }

}
