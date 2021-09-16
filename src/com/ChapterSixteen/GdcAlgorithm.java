package com.ChapterSixteen;

public class GdcAlgorithm {
    public static int gdc(int firstNumber,int secondNumber) {
//        int i = firstNumber / 2;
        int gdc = 0;
        for (int i = 1; i <= firstNumber/2; i++){
            if (firstNumber% i ==0 && secondNumber% i == 0){
                gdc = i;
            }
        }

        return gdc;
    }

//    public static void main(String[] args) {
//        System.out.println();
//    }
}
