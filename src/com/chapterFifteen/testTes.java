package com.chapterFifteen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testTes {

    public static void main(String[] args) throws IOException {
        try (
// Create an output stream to the file
                FileOutputStream output = new FileOutputStream("temp.dat");
        ) {
// Output values to the file
            for (int i = 1; i <= 20; i++)
                output.write(i);
        }
        try (
                FileInputStream input = new FileInputStream("temp.dat");
        ) {
//// Read values from the file
            int value;
            while ((value = input.read()) != 20)
                System.out.print(value + " ");
        }

    }

}

