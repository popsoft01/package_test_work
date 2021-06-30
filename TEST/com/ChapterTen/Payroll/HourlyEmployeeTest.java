package com.ChapterTen.Payroll;

import org.junit.jupiter.api.BeforeEach;

public class HourlyEmployeeTest {
    HourlyEmployee hourlyEmployee;
    @BeforeEach
    void StartEachWith(){
        hourlyEmployee = new HourlyEmployee("ola","Bola","123456",50,300);
    }
}
