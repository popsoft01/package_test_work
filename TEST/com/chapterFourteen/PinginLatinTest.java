package com.chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinginLatinTest {
    PigLatin pigLatin;

    @BeforeEach
    void  startEachWith(){
        pigLatin = new PigLatin();
    }
    @Test
    void sententenceCan_BeSplit(){
        pigLatin.sentenceToken("OLu is a Boy");
        assertEquals("OLu",pigLatin.getTokenNizeSentence());
    }
}
