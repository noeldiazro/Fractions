package io.montanus.math.test;

import io.montanus.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void alreadyInLowestTerms() {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
