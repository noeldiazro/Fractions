package io.montanus.math.test;

import io.montanus.math.NumberTheory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GreatestCommonDivisorTest {
    private final int a;
    private final int b;
    private final int expectedGcd;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 2},
                {-1, -1, 1},
                {2, 3, 1},
                {4, 7, 1},
                {-2, -3, 1},
                {3, 9, 3},
                {5, 30, 5},
                {6, 8, 2},
                {49, 315, 7},
                {-24, -28, 4},
                {-24, 28, 4},
                {24, -28, 4}
        });
    }

    public GreatestCommonDivisorTest(int a, int b, int expectedGcd) {
        this.a = a;
        this.b = b;
        this.expectedGcd = expectedGcd;
    }

    @Test
    public void test() {
        assertEquals(expectedGcd, NumberTheory.gcd(a, b));
    }

}
