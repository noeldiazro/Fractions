package io.montanus.math.test;

import io.montanus.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorsAndSameDenominators() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
