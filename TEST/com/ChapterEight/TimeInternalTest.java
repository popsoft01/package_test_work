package com.ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeInternalTest {
    TimeInternal timer;
    @BeforeEach
    void start(){
        timer = new TimeInternal(4,5,3);
    }

    @Test
    void canSetHour(){
        timer.sethour(5);
        assertEquals(5,timer.getHour());
    }
    @Test
    void hourCannot_BeZero(){
//        timer.sethour(0);
//        timer.sethour(25);
      Exception exception = assertThrows(IllegalArgumentException.class,() ->timer.sethour(0),"hour must be between 1 and 24");
      assertEquals("hour must be between 1 and 24",exception.getMessage());
    }
    @Test
    void canSetMinute(){
        timer.setMinute(5);
        assertEquals(5,timer.getMinute());
    }
    @Test
    void minuteCannot_BeZero() {
//        timer.setMinute(0);
//        timer.sethour(25);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> timer.setMinute(0), "hour must be between 1 and 60");
        assertEquals("Minute must be between 1 and 60", exception.getMessage());
    }
    @Test
    void secondCan_BeSet(){
        timer.setSecond(5);
        assertEquals(5,timer.getSecond());
    }
    @Test
    void secondCannot_BeZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> timer.setSecond(0), "seconds must be between 1 and 60");
        assertEquals("seconds must be between 1 and 60", exception.getMessage());
    }
}
