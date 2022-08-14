package com.ChapterTen.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TetrahedomTest {
    Tetrahedom tetrahedom;

    @BeforeEach
    void startEachWith() {
        tetrahedom = new Tetrahedom(3, 2);
    }

    @Test
    void CanCalulateArea() {
        assertEquals(5.196152422706632, tetrahedom.getArea());
    }

    @Test
    void CanCalulateVolume() {
        assertEquals(0.35355339059327373, tetrahedom.getVolume());
    }
}
