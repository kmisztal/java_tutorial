/**
 * Created by krzys on 03.12.2017.
 */
public class PowerFunc {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + f(i));
        }
    }

    public static int f(int i) {
        return i * i;
    }
}
