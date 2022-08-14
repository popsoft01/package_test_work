package com.ChapterSeven;

public class FinabacciNormal {
    public static int finab(int n) {
        if ((n == 1) || (n == 0)) {
            return n;
        } else {
            return finab(n - 2) + finab(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(finab(8));
    }
}
