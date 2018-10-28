package functions;

public class Func2 {
    public static double max(int a, int b){
        System.out.printf("max(int,int)");
        if(a > b) return a;
        else return b;
    }
    public static double max(double a, double b){
        System.out.printf("max(double,double)");
        if(a > b) return a;
        else return b;
    }
    public static double max1(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 3));
        System.out.println(max(1., 3));
        System.out.println(max(1, 3.));
        System.out.println(max(1., 3.));
    }
}
