package com;

import com.ChapterSeven.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KataTest {
    Kata kata;
    @BeforeEach
void startEachWith(){
   kata= new Kata();

}
@Test
void start(){
    assertEquals(8,kata.nterm(2.0,4.0,2.0));
}
////@Test
////void differenceMustBetheSame(){
////        Exception exception = assertThrows();
//}
    @Test
    void startnow(){
        System.out.println(  kata.series(2,4,6,8));
    }
}
