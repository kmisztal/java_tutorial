public class Fs {
    public static double f(double x) {
        System.out.println("f od double");
        return 2 * x + 1;
    }
    public static double f(int x) {
        System.out.println("f od int");
        return 2 * x + 1;
    }

    public static void main(String[] args) {
        int x = 3;
        double b = f(x);
        System.out.println("f("+x+")=" + b);
    }
}
