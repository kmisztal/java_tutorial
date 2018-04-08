package stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

class Track{

    private final int val;
    private final String name;

    public Track(String name, int val) {
        this.name = name;
        this.val = val;
    }


    int getLength(){
        return val;
    }

    @Override
    public String toString() {
        return "Track{" +
                "val=" + val +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Test1 {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "hello")
//                .map(string -> string.toUpperCase())
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println("collected = " + collected);

        List<String> beginningWithNumbers
                = Stream.of("a", "a1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());
        System.out.println("beginningWithNumbers = " + beginningWithNumbers);

        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(Collection::stream)
                .collect(toList());
        System.out.println("together = " + together);


        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        Track shortestTrack = tracks.stream()
                .filter(track -> track.getLength() > 1000)
                .min(Comparator.comparing(track -> track.getLength()))
                .get();
        System.out.println(shortestTrack);

    }
}
