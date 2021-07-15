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
//       pigLatin.sentenceToken("Olu is a Boy");
//       pigLatin.stringToChar(pigLatin.sentenceToken("Olu is a Boy"));
//        assertEquals("Olu",pigLatin.getTokenNizeSentence());
        pigLatin.sentenceToken("Olu is a Boy");
    }
}
