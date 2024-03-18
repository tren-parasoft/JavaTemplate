package com.parasoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @Test
    void convertToString1() {
        Convertor convertor = new Convertor();
        String result = convertor.convertToString(1);
        assertEquals("1", result);
    }

    @Test
    void convertToString2() {
        Convertor convertor = new Convertor();
        String result = convertor.convertToString(2);
        assertEquals("2", result);
    }

    @Test
    void convertToString3() {
        Convertor convertor = new Convertor();
        String result = convertor.convertToString(3);
        assertEquals("3", result);
    }
}