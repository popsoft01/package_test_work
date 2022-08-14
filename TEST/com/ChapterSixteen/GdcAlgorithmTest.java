package com.ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.ChapterSixteen.GdcAlgorithm.gdc;
import static com.ChapterSixteen.GdcAlgorithm.gdcTwo;
import static org.junit.jupiter.api.Assertions.*;

public class GdcAlgorithmTest {

    GdcAlgorithm gdcAlgorithm;

    @BeforeEach
    void setUp() {
        gdcAlgorithm = new GdcAlgorithm();
    }

    @Test
    void GdcAlgorithm_is_Not_null() {
        assertNotNull(gdcAlgorithm);
    }

    @Test
    void gdcCanbecalculated() {
        int numReturn = gdc(8, 12);
        assertEquals(4, numReturn);
    }

    @Test
    void firstNumberGreaterThanSecondNumber() {
        int numReturn = gdc(16, 12);
        assertEquals(4, numReturn);
    }

    @Test
    void checkForZeroInFirstNumber() {
//        int numReturn = GdcAlgorithm.gdc(0,12);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> gdc(0, 12), "Zero is indivisible");
        assertEquals(exception.getMessage(), "Zero is indivisible");
    }

    @Test
    void checkForZeroInSecondNumber() {
//        int numReturn = GdcAlgorithm.gdc(0,12);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> gdc(12, 0), "Zero is indivisible");
        assertEquals(exception.getMessage(), "Zero is indivisible");
    }

    @Test
    void set() {
        System.out.println(gdcTwo(12, 16));
    }

}
