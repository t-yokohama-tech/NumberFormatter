package com.example.numberformat;

import java.util.List;

public interface IntForString {
    String intForStr(int n, List<String> daijiNumList, List<String> daijiPlaceList);

    int getCalcResult(int n, int i);

    int loopTimesCalc(int n);
}
