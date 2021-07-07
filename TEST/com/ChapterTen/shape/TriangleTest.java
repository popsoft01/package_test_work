package com.ChapterTen.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    void canculateArea(){
        Triangle triangle = new Triangle(2,4,2);
        assertEquals(4,triangle.getArea());
    }

}
