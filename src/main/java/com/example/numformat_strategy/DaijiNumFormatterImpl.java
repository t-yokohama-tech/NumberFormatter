package com.example.numformat_strategy;


import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DaijiNumFormatterImpl implements NumFormatContext.NumFormatStrategy {

    private interface DigitFormatter{
        String format(int place );
    }

    private static DigitFormatter empty(){

        return place -> "";
    }

    private static DigitFormatter digit(String digit){
        return place -> digit + daijiPlaceList.get(place);
    }

    private static final List<DigitFormatter> digitFormatters = List.of(
            empty(),     // 0
            digit("壱"), // 1
            digit("弐"), // 2
            digit("参"), // 3
            digit("肆"), // 4
            digit("伍"), // 5
            digit("陸"), // 6
            digit("漆"), // 7
            digit("捌"), // 8
            digit("玖")  // 9
    );
    private static final List<String> daijiPlaceList = List.of(
            "", "拾", "佰", "仟", "萬"
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
            convertNum = formatDigit(calcResult, i);
            // 文字列を結合
            resultStr = convertNum.concat(resultStr);
        }
        // 文字列化したものを返却　　
        return resultStr;
    }



    protected String formatDigit(int digit, int place) {
        return digitFormatters.get(digit).format(place);
    }

}


