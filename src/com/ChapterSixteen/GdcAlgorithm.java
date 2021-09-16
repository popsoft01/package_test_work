package com.ChapterSixteen;

public class GdcAlgorithm {
    public static int gdc(int firstNumber,int secondNumber) {
//        int i = firstNumber / 2;
        if (firstNumber == 0 || secondNumber == 0){
            throw new IllegalArgumentException("Zero is indivisible");
        }
        int gdc = 1;
        for (int i = 1; i <= firstNumber/2; i++){
            if (firstNumber% i ==0 && secondNumber% i == 0){
                gdc = i;
            }
        }

        return gdc;
    }
    public static int gdcTwo(int m,int n){
        if (n % m ==0){
            return m;
        }else {
            return gdcTwo(n, m%n);
        }
    }


//    public static void main(String[] args) {
//        System.out.println();
//    }
}
