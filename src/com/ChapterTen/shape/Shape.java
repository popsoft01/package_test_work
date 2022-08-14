package com.ChapterTen.shape;

public abstract class Shape {

    private double width;
    private double length;

    public Shape() {
    }

    public Shape(double length, double width) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater 0.0");
        } else {
            this.length = length;
        }
        if (width < 0.0) {
            throw new IllegalArgumentException("Width must be greater 0.0");
        } else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("Lengh must be greater 0.0");
        } else {
            this.width = width;
        }

    }

    @Override
    public String toString() {
        return "Shape{" + "width=" + width + ", length=" + length + "Area " + getArea() + " }";
    }

    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater 0.0");
        } else {
            this.length = length;
        }
    }

    public abstract double getArea();


    public void setLength(int length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater 0.0");
        } else {
            this.length = length;
        }
    }
}
