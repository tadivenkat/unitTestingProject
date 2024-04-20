package com.venkat.unitTestingProject.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setup() {}

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

    @Test
    void getFactorial_factorialOfNegativeNumberIs1Test() {
        BigInteger result = Utils.getFactorial(-2L);
        assertTrue(1L == result.longValue());
    }

    @Test
    void getNthTermOfFibonacciSequence_firstTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(1L);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void getNthTermOfFibonacciSequence_secondTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(2L);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getNthTermOfFibonacciSequence_thirdTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(3L);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void getNthTermOfFibonacciSequence_fourthTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(4L);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void getNthTermOfFibonacciSequence_eighthTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(8L);
        assertThat(result).isEqualTo(13);
    }

    @Test
    void getNthTermOfFibonacciSequence_thirtythTerm() {
        BigInteger result = Utils.getNthTermOfFibonacciSequence(30L);
        assertThat(result).isEqualTo(514229);
    }

    @AfterEach
    void teardown() {}

    @AfterAll
    static void cleanupAfterAllTests() {}
}
