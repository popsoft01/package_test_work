package com.ChapterTen.payable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice invoice;
    @BeforeEach
    void StartEachWith(){
        invoice = new Invoice("2","good",10,100);
    }
    @Test
    void canSetQuantity(){

        invoice.setQuantity(10);
        assertEquals(10,invoice.getQuantity());
    }
    @Test
    void canSetPricePerItem(){

    }
}
