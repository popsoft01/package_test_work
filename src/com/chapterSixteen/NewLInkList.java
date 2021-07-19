package com.chapterSixteen;

import java.util.Arrays;
import java.util.LinkedList;

public class NewLInkList {
    public static void main(String[] args) {
        String[] name = {"Bola", "Tola", "Tope", "Sade","Bukky"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(name));
        list.addLast("Tulo");
        list.addFirst("Tunde");
        list.add("Biola");
        list.add("Tutu");

        System.out.println("");
        list.size();
    }
}
