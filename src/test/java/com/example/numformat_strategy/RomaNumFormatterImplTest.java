package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomaNumFormatterImplTest {

    private final RomaNumFormatterImpl romaNumFormatter = new RomaNumFormatterImpl();

    private final NumFormatContext numFormatContext = new NumFormatContext(romaNumFormatter);


    @Test
    public void minRomaTest() {
        assertEquals("Ⅰ", numFormatContext.format(1));
    }

    @Test
    public void maxRomaTest() {
        assertEquals("MMMCMXCⅨ", numFormatContext.format(3999));
    }

    @Test
    public void WithZeroPtnTest() {
        assertEquals("MMⅠ", numFormatContext.format(2001));
    }

}
