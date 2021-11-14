public class Factorial {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "!=" + factorial(i));

        }
    }

    private static int factorial(int n) {
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
