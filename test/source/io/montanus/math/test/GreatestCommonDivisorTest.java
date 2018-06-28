package io.montanus.math.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    public void oneAndOne() {
        assertEquals(1, gcd(1, 1));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
