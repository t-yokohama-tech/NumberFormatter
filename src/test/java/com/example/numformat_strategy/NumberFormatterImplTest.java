package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NumberFormatterImplTest {

   private final NumFormatContext numFormatContext = mock(NumFormatContext.class);

    private final NumberFormatterImpl numberFormatter
            = new NumberFormatterImpl(numFormatContext);

    // format()が呼ばれ、文字列の数字を返すことの確認
    @Test
    public void formatDigitTest() {
        int n = 1;
        doReturn("1").when(numFormatContext).format(n);

        var result = numberFormatter.format(n);
        assertEquals("1", result);

        verify(numFormatContext, times(1)).format(1);

        }

}
