package com.company;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MenyMetoderTest {

    MenyMetoder menyMetoder = new MenyMetoder() ;
    kund k1=new kund("Diamanda Djedi","7608021234", LocalDate.parse("2022-01-30"));
    kund k2=new kund("Chamade Coriola","8512021234", LocalDate.parse("2018-03-12"));

    @Test
    void giltigtmedlemskap() {
        assertTrue(menyMetoder.giltigtmedlemskap(k1));
        assertFalse(menyMetoder.giltigtmedlemskap(k2));
    }
}