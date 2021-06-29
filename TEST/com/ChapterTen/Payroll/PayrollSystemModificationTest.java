package com.ChapterTen.Payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollSystemModificationTest {
    WeeklySalary weeklySalary; //= new WeeklySalary("Olu","Sola","123456");

    @BeforeEach
    void startEachWith(){
        weeklySalary = new WeeklySalary("Olu","Sola","123456");
    }
    @Test
    void canSetFirstname(){
        assertEquals("Olu",weeklySalary.getFirstName());
    }
    @Test
    void cansetLastName(){
        assertEquals("Sola",weeklySalary.getLastName());
    }
    @Test
    void canSetSSN(){
        assertEquals("123456",weeklySalary.getSSN());
    }

}
