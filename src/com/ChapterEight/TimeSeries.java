package com.ChapterEight;

public class TimeSeries {
    private int  hour;
    private int minute;
    private int seconds;

//    public void SetTime(int hour, int minute, int seconds) throws illegalArgurmentExcption {
//        SetHour(hour, 24, "Hour was out of range");
//        setMinute(minute, 60, "Minute was of range");
//        setSeconds(seconds, 60, "Second was out of range");
//    }

    public void setSeconds(int seconds) throws illegalArgurmentExcption {
        if (seconds < 0 || seconds > 60) {
            throw new illegalArgurmentExcption("second out of range");
        }
    }

    public void setMinute(int minute) throws illegalArgurmentExcption {
        if (minute < 0 || minute >60){
            throw new illegalArgurmentExcption("minute out of range");
        }
    }

    public void setHour(int hour)throws illegalArgurmentExcption {
        if(hour <0 || hour>24){
            throw new illegalArgurmentExcption("hour out of range");
        }
    }

    public  String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,seconds);
    }
    public String toString(){
        return String.format("%d:%02d:02d %s", (hour ==0 || hour==12) ? 12:hour%12,minute,seconds,(hour<12)? "AM":"PM");
    }

    public static void main(String[] args) {
        TimeSeries time = new TimeSeries();
        try {
            time.setHour(20);
            time.setSeconds(56);
            time.setMinute(45);
        } catch (com.ChapterEight.illegalArgurmentExcption illegalArgurmentExcption) {
            illegalArgurmentExcption.printStackTrace();
        }
        time.toUniversalString();
    }
}
