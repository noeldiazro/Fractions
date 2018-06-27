package io.montanus.math.test;

import io.montanus.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorsAndSameDenominators() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerators() {
        assertNotEquals(new Fraction(1, 3), new Fraction(2, 3));
    }

    @Test
    public void differentDenominators() {
        assertNotEquals(new Fraction(1, 3), new Fraction(2, 3));
    }

    @Test
    public void wholeNumberEqualsFraction() {
        assertEquals(new Fraction(8), new Fraction(8, 1));
    }
}
