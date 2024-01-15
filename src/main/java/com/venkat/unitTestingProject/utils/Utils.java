package com.venkat.unitTestingProject.utils;

import java.math.BigInteger;

public class Utils {
    private Utils() {}
    public static BigInteger getFactorial(Long number) {
        if (number <= 1) {
            return BigInteger.valueOf(1L);
        }
        BigInteger result = BigInteger.valueOf(1L);
        for (long i = number; i > 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
