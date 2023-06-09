package com.example.numformat_strategy;

import com.example.numformat_strategy.NumFormatStrategy;
import com.example.numformat_strategy.NumFormatStrategyImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumFormatStrategyImplTest {


private final NumFormatStrategy numFormatStrategy = new NumFormatStrategyImpl();
    @Test
    public void minNumTest(){
        assertEquals("1", numFormatStrategy.format(1));
    }

    @Test
    public  void maxNumTest(){
        assertEquals("2147483647", numFormatStrategy.format(2147483647));
    }

}
