package com.ChapterEight;

public class StackClass {
    private int[] element;
    private int size;
    private static final int DEFAULT_COUNT = 10;

    public StackClass(){
        this(DEFAULT_COUNT);
    }
    public StackClass(int capacity){
        element = new int[capacity];
    }
}
