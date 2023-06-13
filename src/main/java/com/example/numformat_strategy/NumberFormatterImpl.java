package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NumberFormatterImpl implements NumberFormatter {

    private static final List<String> numberList = List.of(
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    );


    protected String formatDigit(int digit, int place) {
        // 文字列化処理したものを返却　　
        return numberList.get(digit);
    }

    @Override
    public String format(int n) {
        return null;
    }
}
