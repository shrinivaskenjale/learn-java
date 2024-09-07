package java_21_big_integer;

import java.math.BigInteger;

public class Operations {
    public static void main(String[] args) {
        // BigInteger objects are immutable.
        // Whatever operation you perform, result is returned. Changes are not made to
        // original object.

        BigInteger a = BigInteger.valueOf(10);
        BigInteger b = BigInteger.valueOf(5);

        // add
        System.out.println(a.add(b));

        // subtract
        System.out.println(a.subtract(b));

        // multiply
        System.out.println(a.multiply(b));

        // divide
        System.out.println(a.divide(b));

        // mod
        System.out.println(a.mod(b));
        // we also have modInverse

        // power
        System.out.println(a.pow(3)); // exponent is int
        System.out.println(a.modPow(a, b)); // both exponent and mod are BigInteger

        // We can chain multiple operations
        System.out.println(a.add(b).multiply(a).divide(new BigInteger("25")));

    }
}
