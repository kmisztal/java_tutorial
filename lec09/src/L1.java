import javax.swing.*;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class L1 {
    public static void f(long r){

    }


    public static void main(String[] args) {
//        BinaryOperator<Long> add = (Long x, Long y) -> x + y;
//
//        System.out.println(add.apply(123L, 1_000_000L));
//
//        BiFunction<String, Integer, Double> ee = (x, y) -> 2.;
//
//        System.out.println(ee.apply("ola", 1));

//        ArrayList<String> list = new ArrayList<>();

//        f(1);

//        JButton button = new JButton();
//        String name = getUserName();
////        name = formatUserName(name);
//        button.addActionListener(event -> System.out.println("hi " + name));


        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(4));

        BinaryOperator add = (x, y) -> x;
    }

    private static String formatUserName(String name) {
        return "";
    }

    private static String getUserName() {
        return "";
    }
}
