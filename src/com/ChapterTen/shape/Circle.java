package com.ChapterTen.shape;

public class Circle extends TwoDemimentionShape {
    public Circle() {
    }

    public Circle(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
