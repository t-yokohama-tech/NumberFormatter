package com.example.numformat_strategy;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NumFormatStrategyImpl implements NumFormatStrategy {

    private static final List<String> numberList = List.of(
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    );

    public String format(int n) {

        int place = 1; //位
        String resultStr = "";
        //引数の値から桁数を取得=ループ回数
        int loopTimes = String.valueOf(n).length();

        for (int i = 0; i < loopTimes; i++) {
            int calcResult;
            String convertNum;
            //　目的の位の数値を取得
            calcResult = (n / (place)) % 10;
            // 割る位の繰り上げ
            place = place * 10;
            // 取得した数値から文字列を取得
            convertNum = formatDigit(calcResult);
            // 文字列を結合
            resultStr = convertNum.concat(resultStr);
        }
        // 文字列化したものを返却　　
        return resultStr;
    }


    protected String formatDigit(int digit) {
        // 文字列化処理したものを返却　　
        return numberList.get(digit);
    }

}
