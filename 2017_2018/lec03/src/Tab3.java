import java.util.Arrays;
import java.util.Scanner;

public class Tab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n liczb");
        int n = 3;
        int[] x = new int[n];
        System.out.println(Arrays.toString(x));
        System.out.println("n="+n);
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(x));
    }
}
