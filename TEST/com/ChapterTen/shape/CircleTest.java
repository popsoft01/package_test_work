package com.ChapterTen.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(2, 4, 3);
    }

    @Test
    void canCalculateArea() {
        assertEquals(28.274333882308138, circle.getArea());
    }
}
