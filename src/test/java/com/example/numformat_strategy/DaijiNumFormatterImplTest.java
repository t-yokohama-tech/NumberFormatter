package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class DaijiNumFormatterImplTest {

    private final INumFormatContext numFormatContext = mock(NumFormatContext.class);
    private final DaijiNumFormatterImpl daijiNumberFormatter
            = new DaijiNumFormatterImpl(numFormatContext);

    // format()が呼ばれ、漢数字（大字）を返すことの確認
    @Test
    public void formatTest() {
        int n = 1;
        doReturn("壱").when(numFormatContext).format(n);

        var result = daijiNumberFormatter.format(n);
        assertEquals("壱", result);

        verify(numFormatContext, times(1)).format(1);

    }
}
