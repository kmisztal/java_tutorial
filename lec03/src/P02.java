/**
 * Created by krzys on 04.11.2017.
 */
public class P02 {
    public static void main(String[] args) {

//        int licznik = 0;
//        while (licznik < 5){
//            System.out.println(licznik+ " Hello world!");
//            ++licznik;
//        }

        int n = 1;
        int count = 1;
        while (n < 100){
            if( n % 2 == 0 && n % 3 == 0){
                System.out.println(count + " " + n);
                ++count;
            }
            ++n;
        }
    }
}
