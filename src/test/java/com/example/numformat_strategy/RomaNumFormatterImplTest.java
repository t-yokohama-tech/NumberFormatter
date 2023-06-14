package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class RomaNumFormatterImplTest {

    private final INumFormatContext numFormatContext = mock(INumFormatContext.class);

    private final RomaNumFormatterImpl romaNumFormatter =
            new RomaNumFormatterImpl(numFormatContext);

    // format()が呼ばれ、ローマ数字を返すことの確認
    @Test
    public void formatDigitTest() {
        int n = 1;
        doReturn("Ⅰ").when(numFormatContext).format(n);

        var result = romaNumFormatter.format(n);
        assertEquals("Ⅰ", result);

        verify(numFormatContext, times(1)).format(1);

    }
}
