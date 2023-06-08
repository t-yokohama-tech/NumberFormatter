package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NumberFormatterImpl extends AbstractNumberFormatter {

    private static final List<String> numberList = List.of(
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    );

    @Override
    protected String formatDigit(int digit, int place) {
        // 文字列化処理したものを返却　　
        return numberList.get(digit);
    }

}
