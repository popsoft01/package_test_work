package com.chapterSixteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsAlgorithm {
    public static void output(List<Character> listRef){
        for (Character character : listRef) {
            System.out.println(character);
        }
        System.out.println("Maximum character is:");
        System.out.println(Collections.max(listRef));
        System.out.println("Manimum character is:");
        System.out.println(Collections.min(listRef));
    }
    public static void copy(List<Character> list,List<Character> newList){
        Collections.copy(newList,list);
    }

    public static void refill(List<Character> list, char put){
        Collections.fill(list, put);
        System.out.println("Element new fill is: ");
        output(list);
    }

    public static void main(String[] args) {
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        output(list);
//        List<Character> refList = new LinkedList<>();
//        copy(refList,list);
//        output(refList);
        refill(list,'K');
    }
}
