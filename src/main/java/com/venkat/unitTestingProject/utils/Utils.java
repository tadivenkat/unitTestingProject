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

    public static BigInteger getNthTermOfFibonacciSequence(Long n) {
        BigInteger timinus2 = BigInteger.valueOf(0);
        BigInteger timinus1 = BigInteger.valueOf(1);
        BigInteger ti = null;
        if (n == 1) {
            return timinus2;
        }
        if (n == 2) {
            return timinus1;
        }
        for (long i = 3; i <= n; i++) {
            ti = timinus2.add(timinus1);
            timinus2 = timinus1;
            timinus1 = ti;
        }
        return ti;
    }
}
