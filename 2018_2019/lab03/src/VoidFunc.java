/**
 * Created by krzys on 03.12.2017.
 */
public class VoidFunc {

    public static void main(String[] args) {
        wpisz(123);
        wpisz(3.3);
        wpisz(3.3f);

        for(double k = 0; k <= 1; k += 0.1){
            System.out.println(k);
        }
    }

    public static void wpisz(int i) {
        System.out.println("dla int " + i);
    }

    public static void wpisz(double i){
        System.out.println("dla double " + i);
    }
}
