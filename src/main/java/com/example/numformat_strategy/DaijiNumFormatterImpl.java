package com.example.numformat_strategy;


import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;


@Component
public class DaijiNumFormatterImpl implements NumberFormatter {

    private final DaijiFormatStrategyImpl daijiFormatStrategy = new DaijiFormatStrategyImpl();
    private final NumFormatContext numFormatContext = new NumFormatContext(daijiFormatStrategy);

    @Override
    public String format(int n) {
        return numFormatContext.format(n);
    }
}

