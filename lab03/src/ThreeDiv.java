import java.util.Scanner;

/**
 * Created by krzys on 05.11.2017.
 */
public class ThreeDiv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int suma = 0;
        while(number > 0){
            suma = suma + number % 10;
            number = number / 10;
        }

        if(suma % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }
    }
}
