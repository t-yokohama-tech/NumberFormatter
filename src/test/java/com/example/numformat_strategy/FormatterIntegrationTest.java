package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatterIntegrationTest {

    // アラビア数字
    NumberFormatterImpl numberFormatter
            = new NumberFormatterImpl(new NumFormatContext(new NumFormatStrategyImpl()));
    // 大字
    DaijiNumFormatterImpl daijiNumFormatter
            = new DaijiNumFormatterImpl(new NumFormatContext(new DaijiFormatStrategyImpl()));
    // ローマ数字
    RomaNumFormatterImpl romaNumFormatter
            = new RomaNumFormatterImpl(new NumFormatContext(new RomaFormatStrategyImpl()));


    // アラビア数字 最小値「１」パターン
    @Test
    public void minNumTest(){
        assertEquals("1",numberFormatter.format(1));
    }

    // アラビア数字 最大値「2147483647」パターン
    @Test
    public  void maxNumTest(){
        assertEquals("2147483647",numberFormatter.format(2147483647));
    }


    // 大字 最小値「１」パターン
    @Test
    public void minDaijiTest() {
        assertEquals("壱", daijiNumFormatter.format(1));
    }

    // 大字 最大値「99999」パターン
    @Test
    public void maxDaijiTest() {
        assertEquals("玖萬玖仟玖佰玖拾玖", daijiNumFormatter.format(99999));
    }

    // 大字 ゼロが入るパターン = 文字の出力なし
    @Test
    public void withZeroPtn() {
        assertEquals("壱萬弐佰参", daijiNumFormatter.format(10203));
    }


    // ローマ数字 最小値「１」パターン
    @Test
    public void minRomaTest() {
        assertEquals("Ⅰ", romaNumFormatter.format(1));
    }

    // ローマ数字 最大値「3999」パターン
    @Test
    public void maxRomaTest() {
        assertEquals("MMMCMXCⅨ", romaNumFormatter.format(3999));
    }

    // ローマ数字 ゼロが入るパターン = 文字の出力なし
    @Test
    public void WithZeroPtnTest() {
        assertEquals("MMⅠ", romaNumFormatter.format(2001));
    }

}
