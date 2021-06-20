package com.ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeInternalTest {
    TimeInternal timer;
    @BeforeEach
    void start(){
        timer = new TimeInternal();
    }

    @Test
    void canSetHour(){
        timer.sethour(5);
        assertEquals(5,timer.getHour());
    }
    @Test
    void hourCannot_BeZero(){
        timer.sethour(30);
//        timer.sethour(25);
      Exception exception = assertThrows(IllegalArgumentException.class,() ->timer.getHour(),"hour must be between 1 and 24");
      assertTrue(exception.getMessage().contains("hour must be between 1 and 24"));
    }
    @Test
    void canSetMinute(){
        timer.setMinute(5);
        assertEquals(5,timer.getMinute());
    }
    @Test
    void minuteCannot_BeZero(){
        timer.setMinute(0);
//        timer.sethour(25);
        assertThrows(IllegalArgumentException.class,() ->timer.getMinute());

    }
}
