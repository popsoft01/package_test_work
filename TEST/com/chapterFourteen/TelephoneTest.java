package com.chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelephoneTest {
    Telephone telephone;

    @BeforeEach
    void startEach_with(){
        telephone = new Telephone("+234 3857-9886");
    }
    @Test
    void can_setPhoneNumber(){
        telephone.setPhoneNumber("+234 3857-9886");
        assertEquals("+234 3857-9886",telephone.getPhonenumber());
    }
    @Test
    void canCansplitToToken(){
        assertEquals("+234",telephone.tokenSplit());
    }

}
