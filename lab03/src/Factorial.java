import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(number == 0){
            System.out.println("0! = 1");
        }else {
            int wynik = 1;

            for (int i = 1; i <= number; i++) {
                wynik *= i;
            }
            System.out.println(number + "! = " + wynik);
        }

    }
}
