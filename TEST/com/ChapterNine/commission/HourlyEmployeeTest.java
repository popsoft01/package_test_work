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
        Exception exception = assertThrows(hour.setHour(0.0).);
    }
}
