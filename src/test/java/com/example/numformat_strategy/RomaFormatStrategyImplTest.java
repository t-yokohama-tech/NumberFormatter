package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;

public class RomaFormatStrategyImplTest {

    private final RomaFormatStrategyImpl romaFormatStrategy = new RomaFormatStrategyImpl();

    //private final NumFormatContext numFormatContext = mock();


    @Test
    public void minRomaTest() {
        assertEquals("Ⅰ", romaFormatStrategy.formatDigit(eq(1), anyInt()));
    }

    @Test
    public void maxRomaTest() {
        assertEquals("MMMCMXCⅨ", romaFormatStrategy.formatDigit(eq(3999), anyInt()));
    }

    @Test
    public void WithZeroPtnTest() {
        assertEquals("MMⅠ", romaFormatStrategy.formatDigit(eq(2001), anyInt()));
    }

}
