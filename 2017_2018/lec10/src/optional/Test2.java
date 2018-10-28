package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Test2 {
    public static void main(String[] args) {
        List<Optional<String>> stringsMaybe = Arrays.asList(
                Optional.of("Hi"),
                Optional.empty(),
                Optional.of(" there!"));
        System.out.println(stringsMaybe);


        List<String> strings = stringsMaybe
                .stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(toList());
        System.out.println(strings);

    }
}
