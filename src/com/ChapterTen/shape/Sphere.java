package com.ChapterTen.shape;

public class Sphere extends  ThreeDymationShape{


    public Sphere() {
    }

    public Sphere(double length, double width,double radius) {
        super(length, width);
        if (radius > 0.0){
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
