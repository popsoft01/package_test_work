package com.ChapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    @Test
    void DuplicateClassExit(){
        DuplicateElimination duplicate = new DuplicateElimination();
        assertNotNull(duplicate);
    }

//    @Test
//    void canGenerateRandomNumber(){
//        DuplicateElimination duplicate = new DuplicateElimination();
//        Random rand = new Random();
//        int numberOne = rand.nextInt(); ;
//        int numberTwo = rand.nextInt();
//        assertNotEquals(duplicate.numberGenerator(numberOne),duplicate.numberGenerator(numberTwo));
//    }

    @Test
    void test(){
        DuplicateElimination duplicate = new DuplicateElimination();
//        int[] array = new int[10];
        int[] array = {4,2,5,7,8,6,0,2,0,6,5,4,9};
//        duplicate.appendMethod(array);
        duplicate.removeDuplicate(array);
        System.out.println(Arrays.toString(array));
    }

//    @Test
//    void test2(){
//        DuplicateElimination duplicate = new DuplicateElimination();
//        int[] array = {2, 4, 1, 4, 5};
//        duplicate.inputDuplicaRemover(array, 5);
//    }
}
