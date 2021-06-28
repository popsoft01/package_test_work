package com.ChapterNine.commission;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(int radius, String colour, boolean filled) {
        super(colour,filled);
        this.radius = radius;

    }

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
