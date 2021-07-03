package com.ChapterTen.shape;

public class TwoDemimentionShape extends Shape{


    private double radius;

    public TwoDemimentionShape() {
    }

    public TwoDemimentionShape(double length, double width,double radius) {
        super(length, width);
        if (radius < 0.0){
            throw new IllegalArgumentException("Length must be greater 0.0");
        }else{
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {

    }
}
