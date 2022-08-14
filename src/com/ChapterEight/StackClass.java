package com.ChapterEight;

public class StackClass {
    private int[] element;
    private int size;
    private static final int DEFAULT_COUNT = 10;

    public StackClass() {
        this(DEFAULT_COUNT);
    }

    public StackClass(int capacity) {
        element = new int[capacity];
    }

    public void push(int value) {
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }
        element[++size] = value;
    }

    public int pop() {
        return element[--size];
    }

    public int peek() {
        return element[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

    }
}
