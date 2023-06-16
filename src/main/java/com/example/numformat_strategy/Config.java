package com.example.numformat_strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public INumFormatContext arabicNumFormatContext(NumFormatStrategyImpl strategy) {
        return new NumFormatContext(strategy);
    }

    @Bean
    public INumFormatContext chineseNumFormatContext(DaijiFormatStrategyImpl strategy) {
        return new NumFormatContext(strategy);
    }

    @Bean
    public INumFormatContext romanNumFormatContext(RomaFormatStrategyImpl strategy) {
        return new NumFormatContext(strategy);

    }
}