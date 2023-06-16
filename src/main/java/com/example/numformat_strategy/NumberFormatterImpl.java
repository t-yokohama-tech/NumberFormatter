package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;

@Component
@lombok.AllArgsConstructor
public class NumberFormatterImpl implements NumberFormatter {

    private final INumFormatContext arabicNumFormatContext;

    @Override
    public String format(int n) {
        return arabicNumFormatContext.format(n);
    }
}
