package io.montanus.math.test;

import io.montanus.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void nonZeroNonNegativeIntegers() {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void sameNonTrivialDenominator() {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}
