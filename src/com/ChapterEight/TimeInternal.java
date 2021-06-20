package com.ChapterEight;

public class TimeInternal {


    private int hour;
    private int minute;

    public void sethour(int hour) {
        if (hour > 0 && hour <= 24){
        this.hour = hour;
        }else throw new IllegalArgumentException("hour must be between 1 and 24");
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
    }

    public int getMinute() {
        return minute;
    }
}
