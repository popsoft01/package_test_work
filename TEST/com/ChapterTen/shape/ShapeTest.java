package com.ChapterTen.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ShapeTest {
    TwoDemimentionShape twoDemimentionShape;
    @BeforeEach
    void startEachWith(){
        twoDemimentionShape = new TwoDemimentionShape(20,);
    }
@Test
void CanSetgetlength(){
   twoDemimentionShape.setLength(20){
       assertEquals(20)
    }
}

}
