import java.util.Arrays;

public class Tab2 {
    public static void print(int[] a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] x = {45, -12, 32, 42, 5432, -21};
        print(x);
        System.out.println(min(x));
    }

    private static int min(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if(x[i] < min){
                min = x[i];
            }
        }
        return min;
    }
}
