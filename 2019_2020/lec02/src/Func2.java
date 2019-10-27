public class Func2 {
    public static void main(String[] args) {
        int x = 2, y = 3;
        System.out.println(prod(x,y));
        System.out.println(prod(x,y, 0.1));
    }

    private static double prod(int a, int b) {
//        return a * b;
        return prod(a, b,1.0);
    }

    private static double prod(int a, int b, double scale) {
        return a * b * scale;
    }
}
