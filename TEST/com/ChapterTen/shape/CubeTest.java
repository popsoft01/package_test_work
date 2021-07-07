package com.ChapterTen.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubeTest {
    Cube cube;
    @BeforeEach
    void startEachWith(){
        cube = new Cube(2,2);
    }
    @Test
    void canCulculateArea(){
        assertEquals(6*Math.pow(2,2),cube.getArea());
    }
    @Test
    void  canCalculateVolume(){
        assertEquals(8,cube.getVolume());
    }
}
