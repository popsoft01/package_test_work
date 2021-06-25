package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionEmployeeTest {
    CommissionEmployee commision ;
    @BeforeEach
    void startEachWith(){
        commision = new CommissionEmployee();
    }
    @Test
    void CommissionEmployeeIsAvailable() {
        assertNotNull(commision);
    }
}
