package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionEmployeeTest {
    CommissionEmployee commision;

    @BeforeEach
    void startEachWith() {
        commision = new CommissionEmployee("Olu", "Olu", "123456", 100.0, 0.04);
    }

    @Test
    void CommissionEmployeeIsAvailable() {
        assertNotNull(commision);
    }


    @Test
    void commissionEmployeecan_setGrossSale() {
        commision.setGrossSales(100);
        assertEquals(100, commision.getGrossSale());
    }

    @Test
    void commissionEmoployee_canNotBeZero() {
//        commision.setGrossSales(0.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> commision.setGrossSales(0.0), "sale must be greater 0.0");
        assertEquals("sale must be greater 0.0", exception.getMessage());
    }

    @Test
    void commisionCan_SetcommisionRate() {
        commision.setCommissiomRate(0.04);
        assertEquals(0.04, commision.getCommissionRate());
    }

    @Test
    void commissionCannotLessThanOne() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> commision.setCommissiomRate(0.0), "commission must be greater 0.0");
        assertEquals("commission must be greater 0.0", exception.getMessage());
    }

    @Test
    void canCalculateEarning() {
        assertEquals(commision.getCommissionRate() * commision.getGrossSale(), commision.earning());
    }
}
