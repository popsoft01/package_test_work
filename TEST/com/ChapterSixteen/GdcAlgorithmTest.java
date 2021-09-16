package com.ChapterSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GdcAlgorithmTest {

    GdcAlgorithm gdcAlgorithm;

    @BeforeEach
    void setUp(){
        gdcAlgorithm = new GdcAlgorithm();
    }

    @Test
    void GdcAlgorithm_is_Not_null(){
        assertNotNull(gdcAlgorithm);
    }
    @Test
    void  gdcCanbecalculated(){
        int numReturn = GdcAlgorithm.gdc(8,12);
        assertEquals(4, numReturn);
    }

    @Test
    void firstNumberGreaterThanSecondNumber(){
        int numReturn = GdcAlgorithm.gdc(16,12);
        assertEquals(4, numReturn);
    }



}
