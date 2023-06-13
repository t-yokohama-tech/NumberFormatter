package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaijiFormatStrategyImplTest {

    private final DaijiFormatStrategyImpl daijiFormatStrategy = new DaijiFormatStrategyImpl();

    // formatDigit()が呼ばれ、漢数字（大字）を返すことの確認
    @Test
    public void formatDigitTest() {
        assertEquals("壱", daijiFormatStrategy.formatDigit(1, 0));
    }
}
