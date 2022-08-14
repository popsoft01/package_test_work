package com.ChapterEight;

public class TimeInternal {


    private int hour;
    private int minute;
    private int seconds;


    public TimeInternal() {
        this(0, 0, 0);
    }

    public TimeInternal(int hour) {
        this(hour, 0, 0);
    }

    public TimeInternal(int hour, int minute, int seconds) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else throw new IllegalArgumentException("hour must be between 1 and 24");

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else throw new IllegalArgumentException("Minute must be between 1 and 60");

        if (seconds >= 0 && seconds < 60) {
            this.seconds = minute;
        } else throw new IllegalArgumentException("Second must be between 1 and 60");

    }

    public void sethour(int hour) {
        if (hour > 0 && hour <= 24) {
            this.hour = hour;
        } else throw new IllegalArgumentException("hour must be between 1 and 24");
    }

    public int getHour() {
        return hour * 3600;
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute <= 60) {
            this.minute = minute;
        } else throw new IllegalArgumentException("Minute must be between 1 and 60");
    }

    public int getMinute() {
        return minute * 60;
    }

    public void setSecond(int second) {
        if (second > 0 && second <= 60) {
            this.seconds = second;
        } else throw new IllegalArgumentException("seconds must be between 1 and 60");
    }

    public int getSecond() {
        return seconds;
    }

    public int internalsecondsTime() {
        return getHour() + getMinute() + getSecond();
    }
}
