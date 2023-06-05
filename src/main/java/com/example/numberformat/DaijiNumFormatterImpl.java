package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaijiNumFormatterImpl implements NumberFormatter {

    private IntForString intForString = new IntForStringImpl();


    @Override
    public String format(int n) {

        int place = 1; //位

        //引数の値から桁数を取得=ループ回数
        int loopTimes = String.valueOf(n).length();

        List<String> daijiPlaceList = List.of(
                "", "拾", "佰", "仟", "萬"
        );

        List<String> daijiNumList = List.of(
                "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );

        // 文字列化したものを返却　　
        return intForString.intForStr(place, loopTimes, n,daijiPlaceList,daijiNumList);
    }

}
