package com.example.numformat_TempMethod;

import java.util.List;

public class DaijiNumFormat extends AbstractFormat {

    public DaijiNumFormat(int n, List<String> numberList){
        this.n = n;
        this.numberList = numberList;
    }

    public String numberFormat(int n, List<String> numberList,int times) {
        String resultStr = "";
        // 対象のケタ数を取得し、（ケタ数＋１）分だけループ
        for (int i = 0; i < times; i++) {
            // getCalcResult：目的の位の数値を取得
            // 取得した数値から文字列を取得し、文字列を結合
            resultStr = numberList.get((n / (int) Math.pow(10, i)) % 10).concat(resultStr);
        }
        // 文字列化したものを返却　　
        return resultStr;
    }

    public int loopTimesCalc(int n) {
        int times;
        for (times = 0; n != 0; times++) {
            n = n / 10;
        }
        return times;
    }
}
