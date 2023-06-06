package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NumberFormatterImpl implements NumberFormatter {

    private final IntForString intForString = new IntForStringImpl();

    @Override
    public String format(int n) {

        List<String> numberList = List.of(
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );

        // 文字列化処理したものを返却　　
        return intForString.intForStr(n, numberList, null);
    }

}
