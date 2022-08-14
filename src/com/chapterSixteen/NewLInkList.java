package com.chapterSixteen;

import java.util.Arrays;
import java.util.LinkedList;

public class NewLInkList {
    public static void main(String[] args) {
        String[] name = {"Bola", "Tola", "Tope", "Sade", "Bukky"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(name));
        list.addLast("Tulo");
        list.addFirst("Tunde");
        list.add("Biola");
        list.add("Tutu");

        System.out.println("number of element in the array");
        System.out.printf("%s", list.size());
        System.out.println();

        System.out.println("element");
        for (String s : list) System.out.println(s);

        for (String s : list)
            list.toArray();
    }
}
