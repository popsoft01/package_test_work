package com.ChapterEight;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class CitiesName {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Lara");
        collection.add("Bola");
        collection.add("titi");
        collection.add("Grace");
        collection.add("Dist");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase(Locale.ROOT) + " ");
        }


    }
}
