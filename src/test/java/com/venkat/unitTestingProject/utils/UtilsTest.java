package com.venkat.unitTestingProject.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class UtilsTest {
    @Test
    void getFactorial_simpleTest() {
        BigInteger result = Utils.getFactorial(5L);
        assertEquals(BigInteger.valueOf(120L), result);
    }

    @Test
    void getFactorial_factorialOf1Is1Test() {
        BigInteger result = Utils.getFactorial(1L);
        assertEquals(BigInteger.valueOf(1L), result);
    }

    @Test
    void getFactorial_factorialOf0Is1Test() {
        BigInteger result = Utils.getFactorial(0L);
        assertEquals(BigInteger.valueOf(1L), result);       
    }
}
