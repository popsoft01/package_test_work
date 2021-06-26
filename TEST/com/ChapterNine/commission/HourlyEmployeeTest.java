package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HourlyEmployeeTest {
    HourlyEmployee hour;
    @BeforeEach
    void startEachWith(){
        hour = new HourlyEmployee("Olu","Bolu","123456",2.0,200.0);
    }
    @Test
    void canSetworkHour(){
        hour.setHour(3);
        assertEquals(3, hour.getHour());
    }
    @Test
    void hourCanNotBeLessThanZero(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->hour.setHour(0.0),"Hour can not be less than Zero");
        assertEquals("Hour can not be less than Zero",exception.getMessage());
    }
    @Test
    void cansetWages(){
        hour.setWage(400.0);
        assertEquals(400, hour.getWages());
    }
    @Test
    void wageCanNotBeLessThanZero(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->hour.setWage(0.0),"Wage can not be less than Zero");
        assertEquals("Wage can not be less than Zero",exception.getMessage());
    }
}
