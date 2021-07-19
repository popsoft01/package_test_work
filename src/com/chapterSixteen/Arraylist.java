package com.chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        String[] colours ={"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String[]> list = new ArrayList<>();
        for (String string : colours)
            list.add(colours);

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();
            removeList.addAll(Arrays.asList(removeColors));

        System.out.println("ArrayList");
    }
}
