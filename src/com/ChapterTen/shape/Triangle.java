package com.ChapterTen.shape;

public class Triangle extends TwoDemimentionShape {
    public Triangle() {
    }

    public Triangle(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    public double getArea() {
        double bregth = getLength();
        double heigth = getWidth();
        return (1/2.0) * bregth * heigth ;
    }
}
