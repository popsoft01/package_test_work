package com.ChapterTen.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {
    TwoDemimentionShape twoDemimentionShape;
    TwoDemimentionShape twoDemimentionShape2;
    @BeforeEach
    void startEachWith(){
        twoDemimentionShape = new TwoDemimentionShape();
        twoDemimentionShape2 = new TwoDemimentionShape(10,20,4);
    }
    @Test
    void CanSetgetlength(){
   twoDemimentionShape.setLength(20);
   assertEquals(20,twoDemimentionShape.getLength());
    }

    @Test
    void cenSetWidth(){
        twoDemimentionShape.setWidth(10);
        assertEquals(10,twoDemimentionShape.getWidth());
    }


}
