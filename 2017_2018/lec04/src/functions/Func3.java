package functions;

public class Func3 {
//    public static double sum(double a1, double a2){
//        return a1 + a2;
//    }
//    public static double sum(double a1, double a2, double a3){
//        return a1 + a2 + a3;
//    }

    public static double sum(double ... a){
        //https://en.wikipedia.org/wiki/Variadic_function
        double ret = 0;
        for(int i = 0; i < a.length; i++){
            ret += a[i];
        }
        return ret;
    }

    public static void main(String [] args) {
        double x = sum(2.4, 5.6);
        System.out.println(x);

        double y = sum(2, 3, 4);
        System.out.println(y);
    }
}
