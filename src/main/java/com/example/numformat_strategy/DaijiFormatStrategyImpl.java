package com.example.numformat_strategy;


import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DaijiFormatStrategyImpl implements NumFormatStrategy {

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

    public String formatDigit(int digit, int place) {
        return digitFormatters.get(digit).format(place);
    }

}


