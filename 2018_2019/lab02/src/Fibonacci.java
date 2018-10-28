import java.util.Scanner;

/**
 * Created by krzys on 05.11.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        switch (number) {
            default:
                System.out.print("Fib(" + number + ")=");
                int c = 0;
                for (int a = 0, b = 1; number > 1; number--) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println(c);
                break;
            case 0:
                System.out.println("Fib(0)=0");
                break;
            case 1:
                System.out.println("Fib(1)=1");
                break;
        }
    }
}
