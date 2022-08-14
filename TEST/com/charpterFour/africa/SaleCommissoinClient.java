package com.charpterFour.africa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SaleCommissoinClient {

    saleCommission sc;


    @BeforeEach
    void doThisBeforeEach() {
        sc = new saleCommission();
    }

    @AfterEach
    void tearDown() {
        assertNull(sc);
    }

    @Test
    void salecommissionCanBeCalculatedCommissionPercentage() {
        assertEquals(0.09, sc.calculatePercentage(100, 9));

    }

    @Test
    void saleCanCalculateSaleCommission() {
        assertEquals(20 * sc.calculatePercentage(100, 9), sc.commissionCalculator(20));
//        System.out.println(20*0.09);
    }

    @Test
    void cancalateRealRevenue() {
//        sc.calculatePercentage(20,9);
        assertEquals(20 - (20 * 0.09), sc.calculateRealRevenue(20));
    }

    @Test
    void canCanlateTotalEarning() {
        assertEquals(20 + (20 * 0.09), sc.CalculatePriceWithCommission(20));
    }

    @Test
    void CancalculateTotalpriceofproductSale() {
        assertEquals(50, sc.sumOfProductprice(10, 5));

    }

}
