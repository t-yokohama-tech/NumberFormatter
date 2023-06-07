package com.example.numformat_TempMethod;

import java.util.List;

public abstract class AbstractFormat {

    int n;
    List<String> numberList;


    public abstract String numberFormat(int n, List<String> numberList, int times);

    public abstract int loopTimesCalc(int n);


    public String format() {

        int times = loopTimesCalc(this.n);
        
        return numberFormat(this.n, this.numberList, times);

    }

}
