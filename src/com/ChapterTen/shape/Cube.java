package com.ChapterTen.shape;

public class Cube extends ThreeDymationShape{

    public Cube() {
    }

    public Cube(double length, double width) {
        super(length, width);
    }


    @Override
    public String toString() {
        return "Cube" + "{" + "Edge :" +getLength() + " Volume " + getVolume() + " Area " + getArea()  + " }";
    }

    @Override
    public double getArea() {
        double edge = getLength();
        return 6 * Math.pow(edge,2);
    }

    @Override
    public double getVolume() {
        double edge = getLength();
        return Math.pow(edge,3);
    }
}
