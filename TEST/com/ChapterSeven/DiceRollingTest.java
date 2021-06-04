package com.ChapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class DiceRollingTest {
    @Test
    void dieNotNull(){
        DiceRolling die = new DiceRolling();
        assertNotNull(die);
    }
    @Test
    void dieCamgenerateRandomNumber(){

        Random rand = new Random();
//        int numberOne = 1 + rand.nextInt(10);
//        int numberTwo = 1 + rand.nextInt(10);
//        assertNotEquals(DiceRolling.dieRoll(),DiceRolling.dieRollTwo());
    }
    @Test
    void canCalculatedSumOfThe_TwoRandomNumber(){
//        DiceRolling.dieRoll(),DiceRolling.dieRollTwo()
//        assertEquals(DiceRolling.dieRoll()+DiceRolling.dieRollTwo(),DiceRolling.sumRandomNumber());
    }
    @Test
    void canAssignArrayToIndex(){
        int[] die = new int[11];
        assertAll(
                ()-> assertEquals(1,DiceRolling.assignArray(die))
        );

    }

    @Test
    void test(){
        int[] die = new int[11];
        DiceRolling.assignArray(die);


    }
}
