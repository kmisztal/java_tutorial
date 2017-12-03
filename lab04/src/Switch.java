/**
 * Created by krzys on 03.12.2017.
 */
public class Switch {
    public static void main(String[] args) {
        int v = 10;

        switch (v % 3){
            case 1:
            case 2:
                System.out.println("Liczba nie jest podzielna przez 3");
                break;
            case 0:
                System.out.println("Liczba podzielna przez 3");
                break;
//            default:


        }
    }
}
