package com.example.numformat_strategy;

import com.example.numberformat.NumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@lombok.AllArgsConstructor
public class RomaNumFormatterImpl implements NumberFormatter {


    private final INumFormatContext romanNumFormatContext;

    @Override
    public String format(int n) {
        return romanNumFormatContext.format(n);
    }
}
