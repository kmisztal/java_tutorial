public class Func3 {
    public static void main(String[] args) {
        int a = 2, b = 10;
        System.out.println(Math.min(a,b));
        System.out.println(Float.min(a,b));
        System.out.println(min(a,b));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
