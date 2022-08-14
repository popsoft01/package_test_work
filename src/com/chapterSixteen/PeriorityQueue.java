package com.chapterSixteen;

import java.util.PriorityQueue;

public class PeriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Double> list = new PriorityQueue<>();
        list.offer(20.5);
        list.offer(12.7);
        list.add(10.5);

        System.out.print("Polling from queue: ");
// display elements in queue
        while (list.size() > 0) {
            System.out.printf("%.1f ", list.poll()); //list.peek() ); // view top element
//            list.poll(); // remove top element
        }
    }

}
