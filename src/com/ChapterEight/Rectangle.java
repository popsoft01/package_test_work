package com.ChapterEight;

import java.util.Scanner;

public class Rectangle {
    private static double length;
    private static double width;
    public double area;

    public Rectangle(){
        setWidth(1.0);
        setLength(1.0);
    }

    public Rectangle(double length, double width){
        if (length <= 0.0 && length > 20.0)
            throw new IllegalArgumentException("value can not be less than zero");
        if (width <= 0.0 && length > 20.0)
            throw new IllegalArgumentException("value can not be less than Zero");

        Rectangle.length = length;
        Rectangle.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0.0 && length >20.0)
            throw new IllegalArgumentException("value can not be less than zero");
        Rectangle.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0.0 && width >20.0)
            throw new IllegalArgumentException("value can not be less than zero");
        Rectangle.width = width;
    }
    public double calculateArea(double length,double width){
        area = length * width;
        return area;
    }
    public double parameter(double length,double width){
      return   2 * length + 2 * width;
    }


    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double newWigth = input.nextDouble();
//        double newLength = input.nextDouble();
        Rectangle rect = new Rectangle(10,15);
        rect.setLength(10);
        rect.setWidth(15);
        System.out.println( rect.calculateArea(rect.getLength(), rect.getWidth()));




    }
}
