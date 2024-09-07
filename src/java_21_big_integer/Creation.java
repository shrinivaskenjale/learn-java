package java_21_big_integer;

import java.math.BigInteger;

public class Creation {
    public static void main(String[] args) {
        // using constructor
        BigInteger a = new BigInteger("12");

        // using valueOf method
        BigInteger b = BigInteger.valueOf(24);

        // converting to string
        String aString = a.toString();
        String bString = b.toString();

        // converting to double
        // If this BigInteger has too great a magnitude to represent as a double, it
        // will be converted to Double.NEGATIVE_INFINITY or Double.POSITIVE_INFINITY as
        // appropriate.
        double aDouble = a.doubleValue();
        System.out.println(aDouble);

        System.out.println(a);
        System.out.println(b);
        System.out.println(aString);
        System.out.println(bString);
    }
}
