package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntForStringImpl implements IntForString {

    @Override
    public String intForStr(int n, List<String> numberList, List<String> daijiPlaceList) {
        String resultStr = "";
        // 対象のケタ数を取得し、（ケタ数＋１）分だけループ
        for (int i = 0; i < loopTimesCalc(n); i++) {
            // getCalcResult：目的の位の数値を取得
            // 取得した数値から文字列を取得し、文字列を結合
            resultStr = numberList.get(getCalcResult(n, i)).concat(resultStr);
        }
        // 文字列化したものを返却　　
        return resultStr;
    }

    // 対象ケタの数値を計算
    @Override
    public int getCalcResult(int n, int i) {
        //　目的の位の数値を取得
        return (n / (int) Math.pow(10, i)) % 10;
    }

    // 対象のケタ数を計算
    @Override
    public int loopTimesCalc(int n) {
        int times;
        for (times = 0; n != 0; times++) {
            n = n / 10;
        }
        return times;
    }

}
