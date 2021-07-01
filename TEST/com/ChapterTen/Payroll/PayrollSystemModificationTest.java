package com.ChapterTen.Payroll;

import com.ChapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PayrollSystemModificationTest {
    SalaryEmployee salaryEmployee; //= new WeeklySalary("Olu","Sola","123456");
    Date birthday = new Date(02,04,2016);

    @BeforeEach
    void startEachWith(){
        salaryEmployee = new SalaryEmployee("Olu","Sola","123456",200.0, birthday);
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
    void canSetDateOfBirthday(){
       salaryEmployee.setDate(birthday);
       assertEquals(birthday,salaryEmployee.getBirthday());
    }
    @Test
    void setWeeklySalaryCannotBeLessThanZero(){
       Exception exception = assertThrows(IllegalArgumentException.class,()-> salaryEmployee.setWeeklySalary(-2),"invalid salary amount");
        assertEquals("invalid salary amount",exception.getMessage() );
    }


}
