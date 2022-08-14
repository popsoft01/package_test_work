package com.ChapterNine.commission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PrimeNumberTest {
    PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    @Test
    void setPrimeNumberNotNull() {
        assertNotNull(primeNumber);
    }

    @Test
    void canCheckForPrimeNumber() {
//        assertEquals();
    }
}
