package com.example.numberformat;

import java.util.List;

public interface IntForString {
    String intForStr(int place, int loopTimes, int n, List<String> numberList);

    String intForStr(int place, int loopTimes, int n, List<String> daijiPlaceList,List<String> daijiNumList);
}
