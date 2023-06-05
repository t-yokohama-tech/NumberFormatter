package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NumberFormatterImpl implements NumberFormatter {

    @Override
    public String format(int n) {

        // nの範囲指定
        if (n >= 1 && n <= Integer.MAX_VALUE) {
            // 文字列変換　　
            String str = String.valueOf(n);
            return str;
        }
        return "範囲外";
    }

}
