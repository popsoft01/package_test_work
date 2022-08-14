package com.chappterFive;

import javax.swing.*;

public class TriangleRight {
    public static void firstTriangle() {
        int star = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.println();

            }


        }
    }

    public static void pryramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = n; k >= n; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (2 * i - 1); j++)
                System.out.print("* ");
        }
        System.out.println("");
    }

    public static void diamond(int n) {
        int star = n;
        if (n > 0 && n < 19 && n % 2 != 0) {
            for (int i = n; i < star; i++) {


            }
        }

    }

    public static void main(String[] args) {
        pryramidPattern(5);
        firstTriangle();
    }
}
