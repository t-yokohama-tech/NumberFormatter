package com.example.numformat_strategy;

class NumFormatContext {
    NumFormatStrategy numFormatStrategy;

    public NumFormatContext(NumFormatStrategy numFormatStrategy) {
        this.numFormatStrategy = numFormatStrategy;
    }
}

public interface NumFormatStrategy {
    String format(int n);

}