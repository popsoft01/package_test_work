package com.ChapterEight;

import java.util.ArrayList;

public class StackArrayList {
    ArrayList<Integer> list = new ArrayList<>(10);

    public void push(int number){
        list.add(number);
    }
    public int pop(int number){
      return  list.remove(number);
    }

    public int peek(){
        return list.size();
    }
}
