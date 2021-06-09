package com.ChapterEight.payroll;

public class EmployeeMain {
    public static void main(String[] args) {
        CommisionEmployee employee = new CommisionEmployee("Ola", "Tope", "2223-23", 0.05, 1000);
        System.out.println(
                "Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSsn());
        System.out.printf("%s %.2f%n", "Gross sales is",
                employee.getGrossSaleAmount());
        System.out.printf("%s %.2f%n", "Commission rate is",
                employee.getCommisionRate());
        employee.setGrossSaleAmount(5000);
        employee.setCommisionRate(.1);
        System.out.printf("%n%s:%n%n %s %n",
                "Updated employee information obtained by toString", employee);
    }
}