import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

public class L2 {
    public static void main(String[] args) {
//        List<String> collected = Stream.of("a", "b", "c")
//                .collect(Collectors.toList());

//        List<String> collected = Stream.of("a", "b", "hello")
//                .map(string -> string.toUpperCase())
//                .collect(Collectors.toList());

        List<String> collected
                = Stream.of("a", "1abc", "abc1").parallel()
                .filter(value -> isDigit(value.charAt(0)))
                .collect(Collectors.toList());

        System.out.println(collected);


    }
}
