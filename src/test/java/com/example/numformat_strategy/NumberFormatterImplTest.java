package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFormatterImplTest {

    private final NumberFormatterImpl numberFormatter = new NumberFormatterImpl();

    // format()が呼ばれ、文字列の数字を返すことの確認
    @Test
    public void formatDigitTest() {
        assertEquals("1", numberFormatter.format(1));
    }
}
