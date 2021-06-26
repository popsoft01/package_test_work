package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePlusCommissionEmployeeTest {
    BasePlusCommissionEmployee base;

    @BeforeEach
    void startEachWith(){
        base = new BasePlusCommissionEmployee("OLu","Bola","123456",300.0,0.04,400);
    }

    @Test
    void cansetBaseSalary(){
        base.setBaseSalary(200.0);
        assertEquals(200.0,base.getBaseSalary());
    }

}
