package com.ChapterTen.Payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PayrollSystemModificationTest {
    SalaryEmployee salaryEmployee; //= new WeeklySalary("Olu","Sola","123456");

    @BeforeEach
    void startEachWith(){
        salaryEmployee = new SalaryEmployee("Olu","Sola","123456",200.0);
    }
    @Test
    void canSetFirstname(){
        assertEquals("Olu", salaryEmployee.getFirstName());
    }
    @Test
    void cansetLastName(){
        assertEquals("Sola", salaryEmployee.getLastName());
    }
    @Test
    void canSetSSN(){
        assertEquals("123456", salaryEmployee.getSSN());
    }
    @Test
    void canSetWeeklysalary(){
        salaryEmployee.setWeeklySalary(200.0);
        assertEquals(200.0, salaryEmployee.getWeeklySalary());
    }
    @Test
    void setWeeklySalaryCannotBeLessThanZero(){
       Exception exception = assertThrows(IllegalArgumentException.class,()-> salaryEmployee.setWeeklySalary(-2),"invalid salary amount");
        assertEquals("invalid salary amount",exception.getMessage() );
    }

}
