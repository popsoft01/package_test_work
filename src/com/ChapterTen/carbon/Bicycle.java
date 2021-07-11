package com.ChapterTen.carbon;

public class Bicycle implements CarbonFootprint{
    private double speed;
    private double gear;

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

    public void setGear(double gear) {
        this.gear = gear;
    }

    public double getGear() {
        return gear;
    }
}
