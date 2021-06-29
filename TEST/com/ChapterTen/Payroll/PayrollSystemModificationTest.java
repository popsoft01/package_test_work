package com.ChapterTen.Payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PayrollSystemModificationTest {
    WeeklySalary weeklySalary; //= new WeeklySalary("Olu","Sola","123456");

    @BeforeEach
    void startEachWith(){
        weeklySalary = new WeeklySalary("Olu","Sola","123456",200.0);
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
    @Test
    void canSetWeeklysalary(){
        weeklySalary.setWeeklySalary(200.0);
        assertEquals(200.0,weeklySalary.getWeeklySalary());
    }
    @Test
    void setWeeklySalaryCannotBeLessThanZero(){
       Exception exception = assertThrows(IllegalArgumentException.class,()->weeklySalary.setWeeklySalary(-2),"invalid salary amount");
        assertEquals("invalid salary amount",exception.getMessage() );
    }

}
