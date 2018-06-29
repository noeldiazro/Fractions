package io.montanus.math;

public class NumberTheory {
    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        else
            return gcd(b, a % b);
    }
}
