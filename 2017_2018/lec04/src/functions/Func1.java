package functions;

public class Func1 {
    public static double add(double x, double y){
        final double bias = 0.6;
        return x + y + bias;
    }

    public static void print(String a){
        System.out.println(a);
        return; // opcjonalne
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        final double bias = 0.6;

        System.out.println(a + b + bias);

        System.out.println(3 + 2 + bias);

        print("hello");
    }
}
