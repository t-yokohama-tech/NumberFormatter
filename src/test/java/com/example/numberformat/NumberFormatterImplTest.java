package com.example.numberformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFormatterImplTest {


private final NumberFormatter numberFormatter = new NumberFormatterImpl();
    @Test
    public void numTest(){
        int n = 647;

        assertEquals("647",numberFormatter.format(n));
    }
}
