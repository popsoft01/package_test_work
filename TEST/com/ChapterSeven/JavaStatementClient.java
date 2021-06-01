package com.ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaStatementClient {
    JavaStatement state;

    @BeforeEach
    void startWith(){
        state=new JavaStatement();
    }


    @Test
    void start(){
        assertNotNull(state);
    }
    @Test
    void canCreateArrayCount(){
        int[] arrayCount = new int[10];
        assertEquals(0, state.createArray(arrayCount));
//        System.out.println(Arrays.);
    }
    @Test
    void canCreateArrayBonus(){
        int[] arrayBonus = new int[15];
    }
}
