import java.sql.SQLOutput;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class L7 {
    public static void main(String[] args) {
        IntStream n = IntStream.of(12, 36, 96, 16, 24);

        IntBinaryOperator gcd = (a, b) -> {
            while (b != 0){
                int c = a % b;
                a = b;
                b = c;
            }
            return a;
        };

        System.out.println(n.reduce(12, gcd));

    }
}
