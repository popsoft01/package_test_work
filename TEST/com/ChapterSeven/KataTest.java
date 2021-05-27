package com.ChapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class KataTest {
    @Test
    void kataisPresent(){
        Kata kata = new Kata();
        assertNotNull(kata);
    }
    @Test
    void arrayCanBeShuffle(){
        Kata kata = new Kata();
        int[] arrays = {5,7,8,2,3,4,9};
        kata.shuffle(arrays);
        assertNotEquals(arrays, arrays);
    }
    @Test
    void arrayCanBeSorted(){
        Kata kata = new Kata();
        int[] arrays = {5,7,8,2,3,4,1};
        kata.shuffle3(arrays);
//        System.out.println(arrays);
//        assertNotEquals(arrays, arrays);
    }
    @Test
    void sortNumInArray(){
        Kata kata = new Kata();
        int[] arr = {6,0,2,5,7,89};
        kata.sortNum(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    void sortNumInArrayTwo(){
        Kata kata = new Kata();
        int[] arr = {6,0,2,5,7,89};
        kata.decreaseSortNum(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void test(){
        Kata kata = new Kata();
        int[] arr = {4,2,5,7,89};
        kata.shuffleWithTwoRandom(arr);
       System.out.println(Arrays.toString(arr));
    }
    @Test
    void test4(){
        Kata kata = new Kata();
        kata.loopDie(20);
//        System.out.println(toString());
    }
    @Test
    void test3(){
        Kata kata = new Kata();
        int[] arr = {4,2,5,7,89};
        int[] second = new int[arr.length];
        kata.copyArrays(arr);
        assertArrayEquals(arr,second);
    }
    @Test
    void test6(){
        Kata kata = new Kata();
        Kata.swap(3,5);

    }
}
