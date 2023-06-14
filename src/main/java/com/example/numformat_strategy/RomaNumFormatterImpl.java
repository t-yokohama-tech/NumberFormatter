package com.example.numformat_strategy;

import com.example.numberformat.NumberFormatter;
import org.springframework.stereotype.Component;

@Component
public class RomaNumFormatterImpl implements NumberFormatter {

    private final RomaFormatStrategyImpl romaFormatStrategy = new RomaFormatStrategyImpl();
    private final NumFormatContext numFormatContext = new NumFormatContext(romaFormatStrategy);

    @Override
    public String format(int n) {
        return numFormatContext.format(n);
    }
}
