package objects;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(a); // 9223372036854775807 * 2
        System.out.println(c);

    }
}
