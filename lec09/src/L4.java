import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L4 {
    public static void main(String[] args) {
        IntUnaryOperator pot = x -> (1 << x);

        IntStream.range(1, 11).map(pot).forEach(System.out::println);
    }
}
