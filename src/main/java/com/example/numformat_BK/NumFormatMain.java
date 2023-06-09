package com.example.numformat_BK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class NumFormatMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("変換したい整数: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("変換したい種類（1:数字,2:大字,3:ローマ数字）: ");
        int mode = Integer.parseInt(reader.readLine());
        List<String> numberList = List.of(
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );
        List<String> daijiNumList = List.of(
                "", "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );

        AbstractFormat abstractFormat = null;

        if (mode == 1) {
            abstractFormat = new NumberFormat(n, numberList, mode);

        } else if (mode == 2) {
            abstractFormat = new NumberFormat(n, daijiNumList, mode);

        } else if (mode == 3) {
            System.out.print("coming soon!");
        }

        if (abstractFormat != null) {
            abstractFormat.format();
        }

    }
}