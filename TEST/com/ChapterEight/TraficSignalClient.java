package com.ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TraficSignalClient {
    TrafficSignal signal;
    @BeforeEach
    void startwith(){
        signal = new TrafficSignal();
    }

    @Test
    void canCreateTraFficSignal(){
        assertNotNull(signal);
    }
    @Test
    void canAssignRed(){

        assertEquals(LigthColour.GREEN,signal.getSignal(20));
//        assertEquals(LigthColour.YELLOW,signal.getSignal(20));
    }
    @Test
    void lightCan_showRed(){
        assertEquals(LigthColour.RED,signal.getSignal(45));
    }
    @Test
    void lightCan_showYellow(){
        assertEquals(LigthColour.YELLOW,signal.getSignal(6));
    }
}
