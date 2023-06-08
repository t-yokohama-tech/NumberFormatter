package com.example.numberformat;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


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

        return Optional.ofNullable(daijiNumList.get(digit))
                .filter(Predicate.not(String::isBlank))
                .map( s -> s + daijiPlaceList.get(place) )
                .orElse( "" );
    }

}


