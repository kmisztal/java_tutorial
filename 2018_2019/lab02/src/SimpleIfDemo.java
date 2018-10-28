import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("parzysta");
        else
            System.out.println("nieparzysta");

        switch (number % 3){
            case 0:
                System.out.println("podzielna przez trzy");
                break;
            default:
                System.out.println("niepodzielna przez trzy");
                break;
        }
    }
}