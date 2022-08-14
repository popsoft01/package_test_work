package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricObjectTest {
    GeometricObject shape;

    @BeforeEach
    void startEachWith() {
        shape = new GeometricObject("Red", false);
    }

    @Test
    void geometricCanSetColour() {
        shape.setColour("Red");
        assertEquals("Red", shape.getColour());
    }

    @Test
    void geometricfillColour() {
        shape.setFilled(true);
        assertEquals(true, shape.isFilled());
    }

    @Test
    void geometricCreateDate() {
        assertEquals(shape.getDateCreated(), shape.getDateCreated());
    }

    @Test
    void exam() {
        System.out.println(shape);

    }
}
