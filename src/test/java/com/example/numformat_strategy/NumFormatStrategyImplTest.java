package com.example.numformat_strategy;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumFormatStrategyImplTest {

    private final NumFormatStrategyImpl numFormatStrategy = new NumFormatStrategyImpl();

    private final NumFormatContext numFormatContext = new NumFormatContext(numFormatStrategy);


    @Test
    public void minNumTest() {
        assertEquals("1", numFormatContext.format(1));
    }

    @Test
    public void maxNumTest() {
        assertEquals("2147483647", numFormatContext.format(2147483647));
    }
}

