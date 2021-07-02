package com.ChapterTen.Payroll;

import com.ChapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    HourlyEmployee hourlyEmployee;
    Date date;

    @BeforeEach
    void StartEachWith(){
        date = new Date(04,05,1994);
        hourlyEmployee = new HourlyEmployee("ola","Bola","123456",date,40,300);
    }


    @Test
    void cansetHour(){
//        hourlyEmployee.setHour(5);
        assertEquals(5.0,hourlyEmployee.getHour());
    }

    @Test
    void cansetWage(){
//        hourlyEmployee.setWage(40);
        assertEquals(40,hourlyEmployee.getWage());
    }
    @Test
    void CanculateEarning(){
       assertEquals(hourlyEmployee.getHour() * hourlyEmployee.getWage(), hourlyEmployee.earning());}
    @Test
    void hourCanbemoreThan40(){
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("bola","Tope","123456",date,50,300);
        assertEquals(40 * hourlyEmployee2.getWage() + (hourlyEmployee2.getHour()-40) *hourlyEmployee2.getWage() *1.5, hourlyEmployee2.earning());}

    @Test
    void  test(){
        System.out.println(hourlyEmployee);
    }

}
