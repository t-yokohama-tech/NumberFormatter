package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;


@Component
@lombok.AllArgsConstructor
public class DaijiNumFormatterImpl implements NumberFormatter {


    private final INumFormatContext chineseNumFormatContext;

    @Override
    public String format(int n) {
        return chineseNumFormatContext.format(n);
    }
}

