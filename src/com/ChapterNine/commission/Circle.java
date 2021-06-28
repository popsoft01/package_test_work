package com.ChapterNine.commission;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(int radius, String colour, boolean filled) {
        super(colour,filled);
        this.radius = radius;

    }

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 3.142*getDiameter();
    }
    public  double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println("The Circle is created" + getDateCreated() + "circle is created " + radius);}

}
