package objects;

public class Big {



    public static void main(String[] args) {
        // int -> Integer
        // double -> Double

        Double a = new Double(2);
        System.out.println(a);

        System.out.println(Double.valueOf("2.0"));

        double b = a * 2;
        System.out.println(b);

        System.out.println(Double.MAX_VALUE);
    }
}
