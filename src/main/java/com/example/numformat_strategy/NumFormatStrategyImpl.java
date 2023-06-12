package com.example.numformat_strategy;

import java.util.List;



public class NumFormatStrategyImpl implements NumFormatStrategy {

    private static final List<String> numberList = List.of(
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    );

    public String formatDigit(int digit,int place) {
        // 文字列化処理したものを返却　　
        return numberList.get(digit);
    }

}
