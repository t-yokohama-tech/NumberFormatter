package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaijiNumFormatterImpl implements NumberFormatter {

    @Override
    public String format(int n) {

        int place = 1; //位
        String resultStr = "";
        //引数の値から桁数を取得=ループ回数
        int loopTimes = String.valueOf(n).length();

        List<String> daijiPlaceList = List.of(
                "", "拾", "佰", "仟", "萬"
        );

        List<String> daijiNumList = List.of(
                "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );


        for (int i = 0; i < loopTimes; i++) {
            int calcResult;
            String convertNum;
            String daijiPlace;
            //　目的の位の数値を取得
            calcResult = (n / (place)) % 10;
            // 割る位の繰り上げ
            place = place * 10;

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

}
