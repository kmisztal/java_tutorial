import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int quantity = 3;

        for (int i = 0; i < quantity; i++) {
            sum += scanner.nextDouble();
        }

        System.out.println(sum/quantity);
    }
}
