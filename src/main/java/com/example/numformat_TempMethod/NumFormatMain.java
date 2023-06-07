package com.example.numformat_TempMethod;

import java.util.List;

public class NumFormatMain {
    public static void NumFormatMain(String[] args) {

//        int mode;
        List<String> numberList = List.of(
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );
        List<String> daijiNumList = List.of(
                "", "壱", "弐", "参", "肆", "伍", "陸", "漆", "捌", "玖"
        );



        AbstractFormat abstractFormat =null;
//        if (mode == 1) {
            abstractFormat =new NumberFormat(abstractFormat.n,abstractFormat.numberList, abstractFormat.times);
//        } else if (mode == 2){
           // abstractFormat =new NumberFormat(abstractFormat.n,abstractFormat.daijiNumList);
//        }


        abstractFormat.numberFormat(abstractFormat.n,abstractFormat.numberList,abstractFormat.times);
    }
}