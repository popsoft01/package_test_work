package com.chapterSixteen;


import com.ChapterEight.TimeInternal;

import java.util.Comparator;

public class TimeComparator implements Comparator<TimeInternal> {
    @Override
    public int compare(TimeInternal time1, TimeInternal time2) {
        int hourDifference = time1.getHour() - time2.getHour();
        if (hourDifference != 0)
            return hourDifference;

        int minuteDifference = time1.getHour() - time2.getHour();
        if (minuteDifference != 0)
            return minuteDifference;

        return time1.getSecond() - time2.getSecond();
    }
}
