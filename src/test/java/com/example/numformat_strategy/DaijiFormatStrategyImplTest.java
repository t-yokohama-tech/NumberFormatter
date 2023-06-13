package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaijiFormatStrategyImplTest {


    private final DaijiFormatStrategyImpl daijiNumberFormatter = new DaijiFormatStrategyImpl();
    private final NumFormatContext numFormatContext = new NumFormatContext(daijiNumberFormatter);



    // 最小値「１」パターン
    @Test
    public void minDaijiTest() {
        assertEquals("壱", numFormatContext.format(1));
    }

    // 最大値「99999」パターン
    @Test
    public void maxDaijiTest() {
        assertEquals("玖萬玖仟玖佰玖拾玖", numFormatContext.format(99999));
    }

    // ゼロが入るパターン = 文字の出力なし
    @Test
    public void withZeroPtn() {
        assertEquals("壱萬弐佰参", numFormatContext.format(10203));
    }

}
