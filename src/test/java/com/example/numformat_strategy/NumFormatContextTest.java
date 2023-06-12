package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumFormatContextTest {
    private final NumFormatStrategyImpl numFormatStrategy = new NumFormatStrategyImpl();

    private final DaijiNumFormatterImpl daijiNumFormatter = new DaijiNumFormatterImpl();

    private final RomaNumFormatterImpl romaNumFormatter = new RomaNumFormatterImpl();

    private final NumFormatContext numFormatContext = new NumFormatContext(numFormatStrategy);

    private final NumFormatContext daijiNumFormatContext = new NumFormatContext(daijiNumFormatter);

    private final NumFormatContext romaNumFormatContext = new NumFormatContext(romaNumFormatter);

    // アラビア数字テスト
    // 最小値「１」パターン
    @Test
    public void minNumTest() {
        assertEquals("1", numFormatContext.format(1));
    }

    // 最大値「2147483647」パターン
    @Test
    public void maxNumTest() {
        assertEquals("2147483647", numFormatContext.format(2147483647));
    }


    //大字数字テスト
    // 最小値「１」パターン
    @Test
    public void minDaijiTest() {
        assertEquals("壱", daijiNumFormatContext.format(1));
    }

    // 最大値「99999」パターン
    @Test
    public void maxDaijiTest() {
        assertEquals("玖萬玖仟玖佰玖拾玖", daijiNumFormatContext.format(99999));
    }

    // ゼロが入るパターン = 文字の出力なし
    @Test
    public void withZeroPtn() {
        assertEquals("壱萬弐佰参", daijiNumFormatContext.format(10203));
    }


    //ローマ数字テスト
    // 最小値「１」パターン
    @Test
    public void minRomaTest() {
        assertEquals("Ⅰ", romaNumFormatContext.format(1));
    }

    // 最大値「3999」パターン
    @Test
    public void maxRomaTest() {
        assertEquals("MMMCMXCⅨ", romaNumFormatContext.format(3999));
    }

    // ゼロが入るパターン = 文字の出力なし
    @Test
    public void WithZeroPtnTest() {
        assertEquals("MMⅠ", romaNumFormatContext.format(2001));
    }


}
