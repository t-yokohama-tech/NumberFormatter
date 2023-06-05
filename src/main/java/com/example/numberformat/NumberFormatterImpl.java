package com.example.numberformat;

import com.example.numberformat.IntForString;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class NumberFormatterImpl implements NumberFormatter {

    private IntForString intForString = new IntForStringImpl();

    @Override
    public String format(int n) {

        int place = 1; //位
        //引数の値から桁数を取得=ループ回数
        int loopTimes = String.valueOf(n).length();



        List<String> numberList = List.of(
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        );

        // 文字列化したものを返却　　
        return intForString.intForStr(place, loopTimes, n, numberList);
    }

}
