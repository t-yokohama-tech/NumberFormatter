package com.example.numformat_BK;

import java.util.List;

public abstract class AbstractFormat {

    int n;
    List<String> numberList;
    int mode;

    public abstract String numberFormat(int n, List<String> numberList, int times);

    public abstract int loopTimesCalc(int n);

    public abstract String daijiPlaceInsert(int n, String resultStr, int times);

    public void format() {

        int times = loopTimesCalc(this.n);

        String resultStr = numberFormat(this.n, this.numberList, times);

        if (this.mode == 2) {
            resultStr = daijiPlaceInsert(this.n, resultStr, times);
        } else if (this.mode == 3) {
            // roma処理
        }

        System.out.print(resultStr);

    }

}
