package com.ChapterTen.shape;

public class Tetrahedom extends ThreeDymationShape{
    public Tetrahedom() {
    }

    public Tetrahedom(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        double edge = getLength();
        return Math.sqrt(3 * Math.pow(edge,2));
    }

    @Override
    public double getVolume() {
        double edge = getLength();
        return edge/(6 * Math.sqrt(2));
    }
}
