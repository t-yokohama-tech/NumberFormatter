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
                "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );

        // 文字列化処理したものを返却　　
        return intForString.intForStr(n, daijiPlaceList, daijiNumList);
    }

}
