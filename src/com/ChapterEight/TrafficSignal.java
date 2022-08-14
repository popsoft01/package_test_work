package com.ChapterEight;

public class TrafficSignal {
    public Object getSignal(int duration) {
        if (duration >= 40 && duration <= 60)
            return LigthColour.RED;
        else if (duration >= 20 && duration <= 40)
            return LigthColour.GREEN;
        else if (duration >= 0 && duration <= 20)
            return LigthColour.YELLOW;
        else
            return null;
    }

}
