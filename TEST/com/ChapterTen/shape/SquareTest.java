package com.ChapterTen.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void canCalculateArae() {
        Square square = new Square(2, 4, 2);
        assertEquals(4, square.getArea());
    }
}
