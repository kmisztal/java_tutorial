public class Func {
    public static boolean a(int _short, int second){
        return (_short == second);
    }
    public static void main(String[] args) {
        boolean x = a(0);
//        boolean y = a(0.);
    }
    private static boolean a(double v) {
        System.out.println("double");
        return (v == 0.d);
    }
    private static boolean a(float arg) {
        System.out.println("float");
        return (arg == 0.f);
    }
}
