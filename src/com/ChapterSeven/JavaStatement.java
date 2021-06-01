package com.ChapterSeven;

import java.util.Arrays;

public class JavaStatement {

    public int createArray(int[] arrayCount) {
        arrayCount = new int[10];
        int i =0;
        for ( ;i <arrayCount.length -1; i++){
            arrayCount[i] = 0;
        }
        return arrayCount[i];
//        return Arrays.toString(arrayCount);
    }

}
