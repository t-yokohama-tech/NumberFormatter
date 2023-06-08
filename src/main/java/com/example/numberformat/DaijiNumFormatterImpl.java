package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@Component
public class DaijiNumFormatterImpl extends AbstractNumberFormatter {


    private static final Map<Integer, String> daijiNumMap = Map.of(
            1, "壱",
            2, "弐",
            3, "参",
            4, "肆",
            5, "伍",
            6, "陸",
            7, "漆",
            8, "捌",
            9, "玖"
    );

    private static final List<String> daijiPlaceList = List.of(
            "", "拾", "佰", "仟", "萬"
    );

    @Override
    protected String formatDigit(int digit, int place) {

        return Optional.ofNullable(daijiNumMap.get(digit))
                .map(s -> s + daijiPlaceList.get(place))
                .orElse("");
    }

}


