package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaijiNumFormatterImplTest {

    private final DaijiNumFormatterImpl daijiNumberFormatter = new DaijiNumFormatterImpl();

    // format()が呼ばれ、漢数字（大字）を返すことの確認
    @Test
    public void formatTest() {
        assertEquals("壱", daijiNumberFormatter.format(1));
    }
}
