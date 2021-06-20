package com.ChapterEight;

public class TimeInternal {


    private int hour;
    private int minute;
    private int seconds;

    public void sethour(int hour) {
        if (hour > 0 && hour <= 24){
        this.hour = hour;
        }else throw new IllegalArgumentException("hour must be between 1 and 24");
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute <=60){
            this.minute = minute;
        }else throw new IllegalArgumentException("Minute must be btw 1 and 60");
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second > 0 && second <=60){
            this.seconds = second;
        }else throw new IllegalArgumentException("second must be btw 1 and 60");
    }

    public int getSecond() {
        return seconds;
    }
}
