package com.example.numberformat;


public abstract class AbstractNumberFormatter implements NumberFormatter {

    @Override
    public String format(int n) {

        int place = 1; //位
        String resultStr = "";
        //引数の値から桁数を取得=ループ回数
        int loopTimes = String.valueOf(n).length();

        for (int i = 0; i < loopTimes; i++) {
            int calcResult;
            String convertNum;
            //　目的の位の数値を取得
            calcResult = (n / (place)) % 10;
            // 割る位の繰り上げ
            place = place * 10;
            // 取得した数値から文字列を取得
            convertNum = formatDigit(calcResult, i);
            // 文字列を結合
            resultStr = convertNum.concat(resultStr);
        }
        // 文字列化したものを返却　　
        return resultStr;
    }

    /**
     * 一桁の数値を文字列化する.
     *
     * @param digit 文字列化する数値
     * @param place 文字列化する数値の桁位置
     * @return 変換後の文字列
     */
    protected abstract String formatDigit(int digit, int place);

}
