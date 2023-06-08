package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DaijiNumFormatterImpl extends AbstractNumberFormatter {

    private static final List<String> daijiNumList = List.of(
            "", "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
    );
    private static final List<String> daijiPlaceList = List.of(
            "", "拾", "佰", "仟", "萬"
    );

    @Override
    protected String formatDigit(int digit, int place) {

        Map<Boolean, String> placeNeedMap = Map.of(
                // 取得した数値が0の場合は空文字を返却
                Boolean.TRUE, "",
                // 数値の漢字＋桁の漢字を結合し、返却
                Boolean.FALSE, daijiNumList.get(digit).concat(daijiPlaceList.get(place))
        );
            return placeNeedMap.get(digit == 0);
    }


}


