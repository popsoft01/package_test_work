package com.ChapterTen.shape;

public class Sphere extends ThreeDymationShape {


    private double radius;

    public Sphere() {
    }

    public double getRadius() {
        return radius;
    }

    public Sphere(double length, double width, double radius) {
        super(length, width);
        if (radius > 0.0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be Zero of less");
        }
    }

    public void setRadius(double radius) {
        if (radius > 0.0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be Zero of less");
        }
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius + " Length " + getLength() + " width " + getWidth() + " Volume " + getVolume() + " Area " + getArea() + '}';
    }
}
