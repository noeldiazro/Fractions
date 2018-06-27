package io.montanus.math.test;

import io.montanus.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonZeroNonNegativeIntegers() {
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void sameNonTrivialDenominator() {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}
