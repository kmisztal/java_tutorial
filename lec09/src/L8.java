import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class L8 {
    public static void main(String[] args) {
        List<String> w = Arrays.asList("ala", "ma", "kota");
        System.out.println(w);
        for (int i = 0; i < w.size()-1; i++) {
                System.out.print(w.get(i) + ", ");
        }
        System.out.println(w.get(w.size()-1));

        System.out.println(w.stream().collect(Collectors.joining(", ")));
    }
}
