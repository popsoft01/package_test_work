package com.ChapterSeven;

public class multiDimention {

    public static void main(String[] args) {
//        display();
        sevenDislay();
    }

    private static void display() {
        char win = 'X';
        char lose = 'o';
        char[][] tik = new char[3][3];
        for (int i = 0; i < tik.length; i++) {
            for (int j = 0; j < tik[i].length; j++) {
                tik[0][0] = win;
                tik[0][2] = win;
                tik[1][2] = win;
                tik[2][1] = win;
                if (tik[i][j] != win) {
                    tik[i][j] = lose;
                }
                System.out.print(tik[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void sevenDislay() {
        int[][] sevenSegment = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        for (int i = 0; i < sevenSegment.length; i++) {
            for (int j = 0; j < sevenSegment[i].length; j++) {
                if (sevenSegment[i][j] == 1) {
//                    sevenSegment[i][j] = "#";
                    System.out.print("#" + " ");
                } else if (sevenSegment[i][j] == 0)
//                    sevenSegment[i][j] = " ";
                    System.out.print(" " + " ");
//                System.out.print(sevenSegment[i][j] + "  ");
            }
            System.out.println();
        }
    }
}


