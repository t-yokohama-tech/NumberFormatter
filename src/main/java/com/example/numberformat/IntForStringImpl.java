package com.example.numberformat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntForStringImpl implements IntForString {


    String resultStr = "";
    int calcResult;
    String convertNum;
    String daijiPlace;

    @Override
    public String intForStr(int place, int loopTimes, int n, List<String> numberList) {


        for (int i = 0; i < loopTimes; i++) {

            //　目的の位の数値を取得
            calcResult = getCalcResult(n,place);
            // 割る位の繰り上げ
            place = place * 10;

            // 取得した数値から文字列を取得
            convertNum = numberList.get(calcResult);
            // 文字列を結合
            resultStr = convertNum.concat(resultStr);
        }
        return resultStr;
    }

    @Override
    public String intForStr(int place, int loopTimes, int n, List<String> daijiPlaceList, List<String> daijiNumList) {

        for (int i = 0; i < loopTimes; i++) {


            //　目的の位の数値を取得
            calcResult = getCalcResult(n,place);
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


    public int getCalcResult(int n, int place) {
        //　目的の位の数値を取得
        calcResult = (n / (place)) % 10;

        return calcResult;
    }




}
