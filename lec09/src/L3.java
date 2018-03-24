import javax.xml.datatype.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class L3 {
    private static long countPrimes(int max) {
        return IntStream
                .range(1, max)
                .filter(L3::isPrime)
                .count();
    }

    private static boolean isPrime(long n) {
        return n > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(divisor -> n % divisor == 0);
    }

    public static void main(String[] args) {
        Instant beg = Instant.now();
        System.out.println(countPrimes(10_000_000));
        Instant end = Instant.now();
        System.out.println(java.time.Duration.between(beg, end).getSeconds());
    }
}

/*
664579
27

664579
43

664579
12

664579
11

 */