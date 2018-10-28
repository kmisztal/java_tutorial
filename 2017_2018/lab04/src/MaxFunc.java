/**
 * Created by krzys on 03.12.2017.
 */
public class MaxFunc {
    public static void main(String[] args) {
        System.out.println(max(1, -3));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
