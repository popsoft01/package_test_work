package com.chapterSixteen;

import com.ChapterEight.TimeInternal;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted3 {
    public static void main(String[] args) {
        List<TimeInternal> list = new ArrayList<>(); // create List
        list.add(new TimeInternal(18, 14, 58));

        list.add(new TimeInternal(6, 5, 34));

        list.add(new TimeInternal(12, 14, 58));

        list.add(new TimeInternal(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", list);

        list.sort(new TimeComparator());

        System.out.printf("Sorted list elements:%n%s%n", list);

    }
}
