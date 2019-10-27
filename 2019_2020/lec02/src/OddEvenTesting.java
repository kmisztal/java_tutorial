import java.util.Scanner;

public class OddEvenTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Poadj liczbę całkowitą:");
        
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
