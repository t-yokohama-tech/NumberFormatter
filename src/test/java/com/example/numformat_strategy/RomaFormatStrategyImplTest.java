package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomaFormatStrategyImplTest {

    private final RomaFormatStrategyImpl romaFormatStrategy = new RomaFormatStrategyImpl();

    // formatDigit()が呼ばれ、ローマ数字を返すことの確認
    @Test
    public void formatDigitTest() {
        assertEquals("Ⅰ", romaFormatStrategy.formatDigit(1, 0));
    }


}
