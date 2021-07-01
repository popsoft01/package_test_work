package com.ChapterTen.Payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePlusEmployeeTest {
    BasePlusEmployee basePlusEmployee;

    @BeforeEach
    void startEachWith(){
        basePlusEmployee = new BasePlusEmployee("Olad","ojo","345678",0.04,300,400.0);
    }
    @Test
    void setBaseSalary(){
        basePlusEmployee.setBaseSalary(200.0);
        assertEquals(200.0, basePlusEmployee.getBaseSalary());
    }

    @Test
    void start(){
        System.out.println(basePlusEmployee);
    }
}
