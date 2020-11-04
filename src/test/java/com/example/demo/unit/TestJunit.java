package com.example.demo.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Hello";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }

}
