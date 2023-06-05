package com.example.numberformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFormatterImplTest {


private final NumberFormatter numberFormatter = new NumberFormatterImpl();
    @Test
    public void minNumTest(){
        assertEquals("1",numberFormatter.format(1));
    }

    @Test
    public  void maxNumTest(){
        assertEquals("2147483647",numberFormatter.format(2147483647));
    }

}
