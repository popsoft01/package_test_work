package com.chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        String[] colours = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>(Arrays.asList(colours));

        String[] removeColors = {"MAGENTA", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        System.out.println("ArrayList");
        for (String s : list) System.out.printf("%s ", s);

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");
        for (String color : list)
            System.out.printf("%s ", color);
    }

    private static void removeColors(List<String> list, List<String> removeList) {

        list.removeIf(removeList::contains);
    }
}
