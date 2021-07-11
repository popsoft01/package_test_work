package com.ChapterTen.carbon;

public class Bicycle implements CarbonFootprint{
    private double speed;

    public Bicycle(int speed, int gear) {

    }

    @Override
    public void getCarbonFootprint() {

    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
