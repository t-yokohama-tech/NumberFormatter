package com.example.numformat_TempMethod;

import java.util.List;

public abstract class AbstractFormat {

    int n;
    List<String> numberList;
    int times;

    public abstract int loopTimesCalc(int n);

    public abstract String numberFormat(int n, List<String> numberList,int times);

    public String format(int n, List<String> numberList, int mode) {
        int times = loopTimesCalc(this.n);

        String resultStr = numberFormat(this.n, this.numberList, this.times);

        return resultStr;
    }

}
