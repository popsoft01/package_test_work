package com.ChapterTen.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SphereTest {
    Sphere sphere = new Sphere();
    Sphere sphere2 = new Sphere(10, 15, 4);

    @Test
    void getRadius() {
        sphere.setRadius(20);
        assertEquals(20, sphere.getRadius());
    }

    @Test
    void canSetRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sphere2.setRadius(0.0), "Radius cannot be Zero of less");
        assertEquals("Radius cannot be Zero of less", exception.getMessage());
    }


    @Test
    void canGetArea() {
        assertEquals(4 * Math.PI * Math.pow(sphere2.getRadius(), 2), sphere2.getArea());
    }

    @Test
    void canGetVolume() {
        assertEquals((4 / 3.0) * Math.PI * Math.pow(sphere2.getRadius(), 3), sphere2.getVolume());
    }
}
