package com.ChapterTen.carbon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarbonBicycleTest {
    Bicycle bicycle;
    @BeforeEach
    void startEachWith(){
        bicycle = new Bicycle(12,10);
    }
    @Test
    void can_setSpeed(){
        bicycle.setSpeed(12);
        assertEquals(12, bicycle.getSpeed());
    }
}
