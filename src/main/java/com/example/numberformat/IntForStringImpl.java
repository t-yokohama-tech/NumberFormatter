package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntForStringImpl implements IntForString {

    String resultStr = "";
    int calcResult;
    int loopTimes = 0;
    String convertNum;
    String daijiPlace;

    @Override
    public String intForStr(int n, List<String> numberList) {
        // 対象のケタ数を取得
        loopTimes = loopTimesCalc(n);

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

    @Override
    public String intForStr(int n, List<String> daijiPlaceList, List<String> daijiNumList) {
        // 対象のケタ数を取得
        loopTimes = loopTimesCalc(n);

        for (int i = 0; i < loopTimes; i++) {
            //　目的の位の数値を取得
            calcResult = getCalcResult(n, i);
            if (calcResult != 0) {
                // 取得した数値から文字列を取得
                convertNum = daijiNumList.get(calcResult - 1);
                // ループ回数から位の漢字を取得
                daijiPlace = daijiPlaceList.get(i);
                // 文字列を結合
                resultStr = convertNum.concat(daijiPlace).concat(resultStr);
            }
        }
        // 文字列化したものを返却　　
        return resultStr;

    }

    // 対象ケタの数値を計算
    public int getCalcResult(int n, int i) {
        //　目的の位の数値を取得
        calcResult = (n / (int) Math.pow(10, i)) % 10;

        return calcResult;
    }

    // 対象のケタ数を計算
    public int loopTimesCalc(int n) {
        while (n != 0) {
            n = n / 10;
            ++loopTimes;
        }
        return loopTimes;
    }


}
