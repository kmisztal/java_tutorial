package fraction;

public class Test {
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(4);
        System.out.println("a="+a);
        System.out.println("b="+b);
//        a + b;
        Fraction sum = Fraction.add(a, b);
        System.out.println(sum);

        Fraction sum2 = a.add(b);
        System.out.println(sum2);

        Fraction sum3 = a.addTo(b);
        System.out.println(sum3);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
