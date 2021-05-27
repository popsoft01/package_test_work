package com.charpterFour.africa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void test(){
        Factorial factorial = new Factorial();
        int fact = factorial.calculateFactorial(5);
        System.out.println(fact);
    }

}