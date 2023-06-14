package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;

@Component
public class NumberFormatterImpl implements NumberFormatter {

    private final NumFormatStrategy numFormatStrategy = new NumFormatStrategyImpl();
    private final NumFormatContext numFormatContext = new NumFormatContext(numFormatStrategy);

    @Override
    public String format(int n) {
        return numFormatContext.format(n);
    }
}
