package com.chapterSixteen;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(21);
        stack.add(23);
        stack.push(54);
        stack.push(24);

        printStack(stack);
    }

    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty())
            System.out.printf("stack is empty%n%n"); // the stack is empty
        else // stack is not empty
            System.out.printf("stack contains: %s (top)%n", stack);
    }
} //

