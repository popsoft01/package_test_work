package com.chapterSixteen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsAlgorithm {
    public static void output(List<Character> listRef){
        for (Character character : listRef) {
            System.out.println(character);
        }
        System.out.println(Collections.max(listRef));
        System.out.println(Collections.min(listRef));
    }
    public static void copy(List<Character> list){
        List<Character> newList = new LinkedList<>();
        Collections.copy(newList,list);
    }

    public
}
