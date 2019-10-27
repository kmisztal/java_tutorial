public class SilniaIteracyjnie {
    public static void main(String[] args) {
        int k = 10;
        System.out.println(silnia(k));
    }

    private static int silnia(int k) {
        int result = 1;
        for(int i = 1; i <= k; ++i){
            result *= i;
        }
        return result;
    }
}
