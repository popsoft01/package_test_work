package com.ChapterSeven;

import java.util.Arrays;

public class Fibonnaci {
    public static int[] fibonnaciSeries(int n){
        int[] fibSeries = new int[n];
        for ( int i = 2;i < n; i++){
            fibSeries[i] = fibSeries[n - 1] + fibSeries[n-2];
            System.out.println(fibSeries[i]);
        }
        return fibSeries;
    }
//    public String toString(){
//        return String.format();
//    }

    public static void main(String[] args) {
//        Fibonnaci fid = new Fibonnaci();
        System.out.println(Arrays.toString( Fibonnaci.fibonnaciSeries(9)));
    }

}
