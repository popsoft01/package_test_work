package com.chapterSixteen;

import java.util.*;

public class LinkLIst {
    public static void main(String[] args)
    {
// add colors elements to list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>(Arrays.asList(colors));
// add colors2 elements to list2
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, colors2);
        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        printList(list1); // print list1 elements
        convertToUppercaseStrings(list1); // convert to uppercase string
        printList(list1); // print list1 elements
        System.out.printf("%nDeleting elements 4 to 6 ...");
        removeItems(list1, 4, 7); // remove items 4-6 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order
    }

    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String color : list)
            System.out.printf("%s ", color);
        System.out.println();
    }

    private static void printReversedList(List<String> list1) {
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }



    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while ( iterator.hasNext() )
        {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to upper case
        }
    }


}