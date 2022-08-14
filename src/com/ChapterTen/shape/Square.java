package com.ChapterTen.shape;

public class Square extends TwoDemimentionShape {
    public Square() {
    }

    public Square(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    public double getArea() {
        return Math.pow(getLength(), 2);
    }
}
