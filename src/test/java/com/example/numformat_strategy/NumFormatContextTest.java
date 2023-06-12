package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumFormatContextTest {
    private final NumFormatStrategyImpl numFormatStrategy = new NumFormatStrategyImpl();

    NumFormatContext numFormatContext = new NumFormatContext(numFormatStrategy);

    @Test
    public void test() {
        assertEquals("",numFormatContext.format(1));
    }
}
