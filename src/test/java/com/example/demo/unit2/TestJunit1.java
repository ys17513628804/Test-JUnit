package com.example.demo.unit2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit1 {
    @Test
    public void testAdd(){
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        assertEquals("Junit is working fined",str);

        assertFalse(num < 6);

        assertNotNull(str);
    }
}
