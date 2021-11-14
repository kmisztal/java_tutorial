import java.util.Arrays;

public class Tab {
    public static void main(String[] args) {
        int[] x = {45, -12, 32, 42, 5432, -21};
        System.out.println(x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println(Arrays.toString(x));

    }
}
