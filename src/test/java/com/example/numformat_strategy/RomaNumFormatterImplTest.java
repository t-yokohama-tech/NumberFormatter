package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomaNumFormatterImplTest {

    private final RomaNumFormatterImpl romaNumFormatter = new RomaNumFormatterImpl();

    // format()が呼ばれ、ローマ数字を返すことの確認
    @Test
    public void formatDigitTest() {
        assertEquals("Ⅰ", romaNumFormatter.format(1));
    }

}
