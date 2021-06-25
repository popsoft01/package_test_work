package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee employee;
    CommissionEmployee commision = new CommissionEmployee();

    @BeforeEach
    void startWith(){
        employee = new Employee("Olu","Olu","12345655");
    }
    @Test
    void EmployeeClassIsAvailable(){
        assertNotNull(employee);
    }
    @Test
    void firstnameCanBe_Created(){
        employee.setFirstName("Olu");
        assertEquals("Olu",employee.getFirstName());
    }

    @Test
    void lastNameCanBe_Created(){
        employee.setLastName("Olu");
        assertEquals("Olu",employee.getLastName());
    }
    @Test
    void SSNCanBe_Created(){
        employee.setsocialSecurityNumber("1234");
        assertEquals("1234",employee.getsocialSecurityNumber());
    }
    @Test
    void SSNCannotBeLessThanSix(){
//        employee.setsocialSecurityNumber("12344");
        Exception exception = assertThrows(UnsupportedOperationException.class,() ->employee.setsocialSecurityNumber("12345"),"invalid Social number");
        assertEquals("invalid Social number",exception.getMessage());
//        assertEquals("1234",employee.getsocialSecurityNumber());
    }
    @Test
    void SSNCannotBeGreaterThanSix(){
//        employee.setsocialSecurityNumber("12344");
        Exception exception = assertThrows(UnsupportedOperationException.class,() ->employee.setsocialSecurityNumber("12345555"),"invalid Social number");
        assertEquals("invalid Social number",exception.getMessage());
//        assertEquals("1234",employee.getsocialSecurityNumber());
    }
    @Test
    void test(){
        System.out.println(employee);
    }

}
