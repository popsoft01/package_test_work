package com.ChapterNine.commission;

public class Circle {
    private boolean filled;
    private String colour;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public Circle() {

    }
}
