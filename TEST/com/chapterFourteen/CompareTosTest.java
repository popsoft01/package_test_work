package com.chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTosTest {

    @Test
    void CanCompareString() {
        CompareTos compareTos = new CompareTos();
//    compareTos.compareString("yes","no");
//        assertEquals("first string is greater",strint);
        System.out.println(compareTos.compareString("yes","no"));
    }
}