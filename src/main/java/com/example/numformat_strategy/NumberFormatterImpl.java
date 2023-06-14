package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;

@Component
@lombok.AllArgsConstructor
public class NumberFormatterImpl implements NumberFormatter {

    private final NumFormatContext numFormatContext;

    @Override
    public String format(int n) {
        return numFormatContext.format(n);
    }
}
