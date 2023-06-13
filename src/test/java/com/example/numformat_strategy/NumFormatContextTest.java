package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class NumFormatContextTest {
    private final NumFormatStrategy numFormatStrategy = mock(NumFormatStrategy.class);

    private final NumFormatContext numFormatContext = new NumFormatContext(numFormatStrategy);


    // NumFormatContext.format() が適切に strategy.formatDigit() を呼ぶこと
    // 数値「1」の場合、formatDigitが１度呼ばれることを確認
    @Test
    public void callConfirmTest() {
        int n = 1;
        when(numFormatStrategy.formatDigit(eq(n), anyInt())).thenReturn("1");
        when(numFormatContext.format(n)).thenReturn("1");
        var result = numFormatContext.format(n);

        // 結果の確認
        assertEquals("1", result);
        verify(numFormatStrategy, times(1)).formatDigit(eq(n), anyInt());

    }

    // NumFormatContext.format() の戻り値が strategy.formatDigit() の戻り値を結合したものであることを確認
    @Test
    public void StrConcatTest() {
        int n = 123;
        when(numFormatStrategy.formatDigit(eq(1), anyInt())).thenReturn("a");
        when(numFormatStrategy.formatDigit(eq(2), anyInt())).thenReturn("b");
        when(numFormatStrategy.formatDigit(eq(3), anyInt())).thenReturn("c");
        var result = numFormatContext.format(n);

        // 結果の確認
        assertEquals("abc", result);

    }
}
