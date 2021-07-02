//package com.ChapterTen.Payroll;
//
//import com.ChapterNine.commission.CommissionEmployee;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CommissionEmployeeTest {
//    CommissionEmployees commissionEmployee = new CommissionEmployees("samson","Bola","345678",0.04,500.0);
//    @BeforeEach
//    void  startEachWith(){
//        commissionEmployee = new CommissionEmployees("samson","Bola","345678",0.04,500.0);
//    }
//    @Test
//    void canSetCommisionRate(){
//        commissionEmployee.setCommissionRate(0.05);
//        assertEquals(0.05,commissionEmployee.getCommissionRate());
//    }
//    @Test
//    void canSetGrossSales(){
//        commissionEmployee.setGrossSales(0.05);
//        assertEquals(0.05,commissionEmployee.getGrossSales());
//
//    }
//    @Test
//    void canCalculateEarning(){
//       assertEquals(commissionEmployee.getCommissionRate() *commissionEmployee.getGrossSales(), commissionEmployee.earning());
//    }
//    @Test
//    void test(){
//        System.out.println(commissionEmployee);
//    }
//}
