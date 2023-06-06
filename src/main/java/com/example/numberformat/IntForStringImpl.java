package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntForStringImpl implements IntForString {

    @Override
    public String intForStr(int n, List<String> numberList, List<String> daijiPlaceList) {
        int calcResult;
        String convertNum;
        String resultStr = "";
        // 対象のケタ数を取得
        int loopTimes = loopTimesCalc(n);

        for (int i = 0; i < loopTimes; i++) {
            //　目的の位の数値を取得
            calcResult = getCalcResult(n, i);
            // 取得した数値から文字列を取得
            convertNum = numberList.get(calcResult);
            // 文字列を結合
            resultStr = convertNum.concat(resultStr);

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
        int Times = 0;
        while (n != 0) {
            n = n / 10;
            ++Times;
        }
        return Times;
    }

}
