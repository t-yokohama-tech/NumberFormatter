package com.example.numformat_strategy;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class RomaFormatStrategyImpl implements NumFormatStrategy {

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


    public String formatDigit(int digit, int place) {
        return Optional.ofNullable((romaAllNumMap.get(place)).get(digit))
                .orElse("");
    }

}
