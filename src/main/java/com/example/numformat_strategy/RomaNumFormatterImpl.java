package com.example.numformat_strategy;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class RomaNumFormatterImpl implements NumFormatContext.NumFormatStrategy {

    private static final Map<Integer, String> romaOnesPlaceMap = Map.of(
            1, "Ⅰ",
            2, "Ⅱ",
            3, "Ⅲ",
            4, "Ⅳ",
            5, "Ⅴ",
            6, "Ⅵ",
            7, "Ⅶ",
            8, "Ⅷ",
            9, "Ⅸ"
    );
    private static final Map<Integer, String> romaTensPlaceMap = Map.of(
            1, "Ⅹ",
            2, "ⅩⅩ",
            3, "ⅩⅩⅩ",
            4, "ⅩL",
            5, "L",
            6, "LⅩ",
            7, "LXX",
            8, "LXXX",
            9, "XC"
    );
    private static final Map<Integer, String> romaHundredsPlaceMap = Map.of(
            1, "C",
            2, "CC",
            3, "CCC",
            4, "CD",
            5, "D",
            6, "DC",
            7, "DCC",
            8, "DCCC",
            9, "CM"
    );
    private static final Map<Integer, String> romaThousandsPlaceMap = Map.of(
            1, "M",
            2, "MM",
            3, "MMM"
    );
    private static final Map<Integer, Map<Integer, String>> romaAllNumMap = Map.of(
            0, romaOnesPlaceMap,
            1, romaTensPlaceMap,
            2, romaHundredsPlaceMap,
            3, romaThousandsPlaceMap
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
        return Optional.ofNullable((romaAllNumMap.get(place)).get(digit))
                .orElse("");
    }

}
