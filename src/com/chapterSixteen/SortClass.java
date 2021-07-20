package com.chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortClass {
    public static void main(String[] args) {
        String[] suit ={"Spade", "Diamond","Clubs","Hearts"};
        List<String> list = Arrays.asList(suit);
        System.out.printf("Unsorted array elements: %s%n", list);
//        Iterator<String> newList = list.iterator();
//        System.out.println(Arrays.toString(newList));
        Collections.sort(list);
        System.out.println(list);

        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }
}
