package com.chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TelephoneTest {
    Telephone telephone;

    @BeforeEach
    void startEach_with(){
        telephone = new Telephone();
    }
    @Test
    void can_setPhoneNumber(){
        telephone.setPhoneNumber("+234 3857-9886");
    }

}
