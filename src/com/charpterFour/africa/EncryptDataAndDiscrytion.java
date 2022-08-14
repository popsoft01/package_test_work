package com.charpterFour.africa;

import java.util.Scanner;

public class EncryptDataAndDiscrytion {
    public void encryption(String message) {
        int key = 5;
        char[] letter = message.toCharArray();
        for (int i : letter) {
            i += key;

            System.out.print(i);
        }
        System.out.println(" ");
        System.out.println(message);

    }

    public static void main(String[] args) {
        EncryptDataAndDiscrytion encrypt = new EncryptDataAndDiscrytion();
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        encrypt.encryption(message);
    }


}
