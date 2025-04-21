package org.example.reverse_integer;

public class IntegerReverser {
    public int reverse(int x) {
        if (x <= Integer.MIN_VALUE && x >= Integer.MAX_VALUE) {
            return 0;
        }
        boolean isNegative = x < 0;
        long rev = 0;
        x = Math.abs(x);
        while (x > 0) {
            int cifra = x % 10;
            rev = rev * 10 + cifra;
            if (rev > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return isNegative ? -(int)rev : (int)rev;
    }
}
