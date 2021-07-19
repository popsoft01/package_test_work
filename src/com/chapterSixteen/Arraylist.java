package com.chapterSixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        String[] colours ={"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>(Arrays.asList(colours));

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        System.out.println("ArrayList");
        for (int count = 0; count < list.size();count++)
            System.out.printf("%s ", list.get(count));

        removeColors(list, removeList);
    }

    private static void removeColors(List<String> list, List<String> removeList) {
        Iterator<String> iterator = (Iterator<String>) list.iterator();

        while (iterator.hasNext()){
            if (removeList.contains(iterator.next()))
                iterator.remove();
        }
    }
}
