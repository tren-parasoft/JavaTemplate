package com.parasoft.another;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    @Test
    void convertToString() {
        Convertor convertor = new Convertor();
        String result = convertor.convertToString(1);
        assertEquals("parasoftcn: 1", result);
    }

    @Test
    void name() {
        Convertor convertor = new Convertor();
        String name = convertor.name();
        assertEquals("number to string convertor", name);
    }
}