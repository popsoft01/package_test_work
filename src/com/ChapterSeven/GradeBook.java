package com.ChapterSeven;

import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudent = 0;

        System.out.println("Enter the number of student");
        numberOfStudent = input.nextInt();
        int i = 0;
       double[] scoreBook = new double[numberOfStudent];
       for (; i<scoreBook.length -1; i++){
           System.out.println("enter the student score");
           double score = input.nextInt();
           scoreBook[i] = score;
           System.out.println(scoreBook[i]);
       }
        System.out.println(scoreBook[i]);



    }
}
