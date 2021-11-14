import java.util.Scanner;

public class ComputeAverage2 {
    public static double average(int quantity){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < quantity; i++) {
            sum += scanner.nextDouble();
        }
        return sum/quantity;
    }
    public static void main(String[] args) {
        double b = average(4);
        System.out.println(b);
        average(2);
        average(3);
    }
}
