package com.example.numberformat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomaFormatStrategyImplTest {

    private final RomaNumFormatterImpl romaNumFormatter = new RomaNumFormatterImpl();


    @Test
    public void minRomaTest() {
        assertEquals("Ⅰ", romaNumFormatter.format(1));
    }

    @Test
    public void maxRomaTest() {
        assertEquals("MMMCMXCⅨ", romaNumFormatter.format(3999));
    }

    @Test
    public void WithZeroPtnTest() {
        assertEquals("MMⅠ", romaNumFormatter.format(2001));
    }

}
