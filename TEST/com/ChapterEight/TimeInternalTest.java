package com.ChapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeInternalTest {
    TimeInternal timer;
    @BeforeEach
    void start(){
        timer = new TimeInternal(4,5,3);
    }
    @AfterEach
    void tearDown(){
        timer = null;
    }

    @Test
    void canSetHour(){
        timer.sethour(5);
        assertEquals(5 * 3600,timer.getHour());
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
        assertEquals(300,timer.getMinute());
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
//        timer.setSecond(5);
        assertEquals(5,timer.getSecond());
    }
    @Test
    void secondCannot_BeZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> timer.setSecond(0), "seconds must be between 1 and 60");
        assertEquals("seconds must be between 1 and 60", exception.getMessage());
    }
    @Test
    void timeCan_beSet(){
//        TimeInternal timer = new TimeInternal(24,5,7);
        timer.sethour(24);
        assertEquals(86400,timer.getHour());
//        System.out.println(timer.getHour());
    }
    @Test
    void timeCan_ManyConstructor(){
        TimeInternal timer = new TimeInternal(4);
        assertEquals(4*3600,timer.getHour());
    }
    @Test
    void timeIs_internalSeconds(){
//        TimeInternal timer = new TimeInternal(4,20,20);
//        System.out.println(timer.getHour());
//        System.out.println(timer.getMinute());
//        System.out.println(timer.getSecond());
        assertEquals((timer.getHour() + timer.getSecond() + timer.getMinute()),timer.internalsecondsTime());
    }
//    @Test
//    void newTimeSet(){
//        assertEquals(((2 * 3600)+(2*60)+2), timer.internalsecondsTime());
//    }

}
