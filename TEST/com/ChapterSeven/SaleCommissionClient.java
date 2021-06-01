package com.ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SaleCommissionClient {
    SaleCommission sale;

    @BeforeEach
    void setup(){
        sale = new SaleCommission();
    }

    @Test
    void saleCommisionIsNotNUll(){
    assertNotNull(sale);
    }

    @Test
    void canCalculateTotalEarning(){
        int salary = (int) (200+(0.09 * 2000));
        System.out.println(salary);
        assertEquals(salary, sale.calculateEarning(2000));
    }

    @Test
    void canDetermineTheArrayIndex(){
        int divid = sale.calculateEarning(10000)/100;
        assertEquals(divid, sale.getIndex());
    }
    @Test
    void canAssignElementToArrayIndexOne(){
        int[] commision = new int[9];
        assertEquals(1,++commision[0]);
        System.out.println(Arrays.toString(commision));
    }
    @Test
    void canAssignElementToArrayIndexthree(){
        int[] commision = new int[9];
        assertEquals(1,++commision[3]);
        assertEquals(1,++commision[2]);
        assertEquals(1,++commision[4]);
        assertEquals(1,++commision[5]);
        assertEquals(2,++commision[5]);
        System.out.println(Arrays.toString(commision));
    }
}
