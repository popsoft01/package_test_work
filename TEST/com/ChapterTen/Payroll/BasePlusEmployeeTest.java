package com.ChapterTen.Payroll;

import com.ChapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePlusEmployeeTest {
    BasePlusEmployee basePlusEmployee;
    Date date;

    @BeforeEach
    void startEachWith() {
        date = new Date(1, 3, 2220);
        basePlusEmployee = new BasePlusEmployee("Olad", "ojo", "345678", date, 30, 0.1, 200);
    }

    @Test
    void testBasePlusEmployeeEarnings() {
        assertEquals(203.0, basePlusEmployee.earning());
    }

    @Test
    void start() {
        System.out.println(basePlusEmployee);
    }
}
