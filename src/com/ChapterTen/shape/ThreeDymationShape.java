package com.ChapterTen.shape;

public abstract class ThreeDymationShape extends Shape {

    public ThreeDymationShape() {
    }

    public ThreeDymationShape(double length, double width) {
        super(length, width);
    }

    @Override
    public abstract double getArea();

    public abstract double getVolume();
}
