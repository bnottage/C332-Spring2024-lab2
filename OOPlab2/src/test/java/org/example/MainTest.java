package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPrime() {

        assertEquals(false, Main.isPrime(1));
        assertEquals(true, Main.isPrime(2));
        assertEquals(true, Main.isPrime(3));
        assertEquals(false, Main.isPrime(4));
        assertEquals(true, Main.isPrime(5));
        assertEquals(false, Main.isPrime(6));
        assertEquals(true, Main.isPrime(7));
        assertEquals(false, Main.isPrime(8));
        assertEquals(false, Main.isPrime(9));
        assertEquals(false, Main.isPrime(10));
        assertEquals(true, Main.isPrime(43));
        assertEquals(true, Main.isPrime(47));
        assertEquals(true, Main.isPrime(83));
        assertEquals(false, Main.isPrime(100));
    }

    @Test
    void primeFactors() {

        assertEquals("[]", Main.primeFactors(1).toString());
        assertEquals("[2]", Main.primeFactors(2).toString());
        assertEquals("[3]", Main.primeFactors(3).toString());
        assertEquals("[2]", Main.primeFactors(4).toString());
        assertEquals("[5]", Main.primeFactors(5).toString());
        assertEquals("[2, 3]", Main.primeFactors(6).toString());
        assertEquals("[7]", Main.primeFactors(7).toString());
        assertEquals("[2]", Main.primeFactors(8).toString());
        assertEquals("[3]", Main.primeFactors(9).toString());
        assertEquals("[2, 5]", Main.primeFactors(10).toString());
    }
}