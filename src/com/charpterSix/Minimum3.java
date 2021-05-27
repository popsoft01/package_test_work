package com.charpterSix;

class Minimum3 {
    public  double minimum3(double num1,double num2,double num3){
        double smallest = 0;
        smallest = Math.min(num1,Math.min(num2,num3));
        return smallest;
    }
    public static int perfertNumber(int number){
        int sum = 0;
        int counter = 1;
        while (counter <= number/2){
            if (number % counter ==0){
                System.out.println(counter);
                sum += counter;
            }
            counter++;
//            if ( sum == counter);
        }
        return sum;
    }
}
