package com.example.numformat_strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FormatterIntegrationTest {

        @Autowired
        private NumberFormatterImpl numberFormatter;

        @Autowired
        private DaijiNumFormatterImpl daijiNumFormatter;

        @Autowired
        private RomaNumFormatterImpl romaNumFormatter;



        @Test
        void returnsArabicFormattedNumber(){
            var result = numberFormatter.format(123);
            assertEquals( "123", result );
        }

        @Test
        void returnsChineseFormattedNumber(){
            var result = daijiNumFormatter.format(123);
            assertEquals( "壱佰弐拾参", result );
        }

        @Test
        void returnsRomanFormattedNumber(){
            var result = romaNumFormatter.format(123);
            assertEquals( "CⅩⅩⅢ", result );
        }

    }



