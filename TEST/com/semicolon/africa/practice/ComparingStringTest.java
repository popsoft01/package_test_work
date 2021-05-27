package com.semicolon.africa.practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringTest {
    ComparingString stringObject;

    @BeforeEach
    void setUp() {
        stringObject = new ComparingString();
    }

    @Test
    void can_compareString() {
       int word = ComparingString.compareString("love", "bad");

     assertEquals(10,word);
    }
    @Test
    void can_compareStringUsingRegionMatchAndIgnorcase(){
        boolean word = ComparingString.regoinMatchCompare("Welcome", "WelCome");
        assertEquals(2,word);
    }
}