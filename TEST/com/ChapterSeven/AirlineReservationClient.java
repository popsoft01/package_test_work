package com.ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirlineReservationClient {
    AirLine airLine;


    @BeforeEach
    void startWith(){
        airLine = new AirLine();
    }
    @Test
    void present(){
        assertNotNull(airLine);
    }
//    @Test
//    void airlineCanAssignFirstClassSeat(){
//
//    }

    @Test
    void canSelectSeatType(){

    }
}
