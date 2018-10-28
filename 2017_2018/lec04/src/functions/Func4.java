package functions;

public class Func4 {

    public static long silnia(long n){
        if(n == 0){
            return 1;
        }else {
            return n * silnia(n - 1);
        }
    }

    public static void main(String[] args) {
        long N = 5;

        System.out.println(silnia(N));
    }
}
