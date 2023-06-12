package com.example.numformat_strategy;

public class NumFormatContext {
        public interface NumFormatStrategy {
        String format(int n);
    }
    NumFormatStrategy numFormatStrategy;

    public NumFormatContext(NumFormatStrategy numFormatStrategy) {
        this.numFormatStrategy = numFormatStrategy;
    }
}