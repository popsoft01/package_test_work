package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class EmployeeMain {
    public static void main(String[] args) {
        Date date = new Date(4,23,1993);
        Date date2 = new Date(9,04,2000);
        Date date3 = new Date(5,5,2003);
        SalaryEmployee salaryEmployee = new SalaryEmployee("ola","bola","234567",date);
        CommissionEmployees commissionEmployees = new CommissionEmployees("zuko","francis","123456",date2,200.0,0.4);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bola","Ade","345689",date,46,400.0);
    }
}
