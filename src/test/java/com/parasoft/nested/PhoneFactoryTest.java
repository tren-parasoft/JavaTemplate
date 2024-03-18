package com.parasoft.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneFactoryTest {

    @Test
    void getIphone4() {
        PhoneFactory.Phone iphone4 = PhoneFactory.getIphone4();
        assertEquals("iphone4", iphone4.getName());
        assertEquals(PhoneFactory.Brand.APPLE, iphone4.getBrand());
        assertEquals("name: iphone4, brand: APPLE", iphone4.toString());
    }
}