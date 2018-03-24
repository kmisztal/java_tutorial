import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class L5 {
    public static void main(String[] args) {
//        IntStream.generate(() -> 10).forEach(System.out::println);
//        IntStream.generate(() -> 10).limit(8).forEach(System.out::println);

        class A implements IntSupplier{
            int lastValue = -1;
            @Override
            public int getAsInt() {
                return lastValue += 2;
            }
        }

        IntStream.generate(new A()).limit(20).forEach(System.out::println);
    }
}
