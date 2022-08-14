package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class EmployeeMain {
    public static void main(String[] args) {
        Date date = new Date(4, 23, 1993);
        Date date2 = new Date(9, 04, 2000);
        Date date3 = new Date(5, 5, 2003);
        Date date4 = new Date(4, 9, 2005);
        SalaryEmployee salaryEmployee = new SalaryEmployee("ola", "bola", "234567", date, 300.0);
        CommissionEmployees commissionEmployees = new CommissionEmployees("zuko", "francis", "123456", date2, 200.0, 0.4);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bola", "Ade", "345689", date3, 46, 400.0);
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("Ola", "Bolato", "12348", date4, 300, 0.6, 300);

        Employee[] employees = new Employee[4];
        employees[0] = basePlusEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = salaryEmployee;
        employees[3] = commissionEmployees;

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
        }
    }
}
