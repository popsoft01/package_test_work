package com.Chapter_fifteen;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class StudentPoll {
    private static Formatter output;

    public void openResponse() {
        try {
            output = new Formatter("number.txt");

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("");
            System.exit(1);
        }

    }
}
