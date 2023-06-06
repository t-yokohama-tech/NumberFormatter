package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaijiNumFormatterImpl implements NumberFormatter {

    private final IntForString intForString = new IntForStringImpl();

    @Override
    public String format(int n) {

        List<String> daijiPlaceList = List.of(
                "", "拾", "佰", "仟", "萬"
        );

        List<String> daijiNumList = List.of(
                "", "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );
        // 位のインサートのためのStringBuilderを宣言
        StringBuilder sb = new StringBuilder();
        // 数字部分の文字列化の結果を取得
        String resultStr = intForString.intForStr(n, daijiNumList, daijiPlaceList);
        sb.append(resultStr);

        int insertNum = 0;
        // 位の漢字の挿入
        for (int i = 0; i < intForString.loopTimesCalc(n); i++) {
            // 値が0以外の場合に位の漢字を挿入する
            if (intForString.getCalcResult(n, i) != 0) {
                sb.insert(resultStr.length() - insertNum, daijiPlaceList.get(i));
                ++insertNum;
            }
        }
        // 文字列化処理したものを返却　　
        return sb.toString();
    }

}
