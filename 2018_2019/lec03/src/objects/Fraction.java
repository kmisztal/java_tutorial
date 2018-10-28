package objects;

public class Fraction {
    public static Fraction ZERO = new Fraction(0);
    public static Fraction ONE = new Fraction(1);

    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator) {
        this.numerator = numerator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // poprawić w przypadku 1/-2 lub -1/-2
    }

    public Fraction add(Fraction x){
        final int d = this.denominator * x.denominator;
        final int n = this.numerator * x.denominator + x.numerator * this.denominator;
        this.numerator = n;
        this.denominator = d;
        return this;
    }


    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        System.out.println(a);
        Fraction b = new Fraction(1, 3);

        a.add(b);

        System.out.println(a);

        System.out.println(Fraction.ONE);
        System.out.println(Fraction.ZERO);

        Fraction[] tab = {
                new Fraction(1),
                new Fraction(1, 2),
                new Fraction(1, 4)
        };

        Fraction[] tab1 = new Fraction[4];
        tab1[0] = new Fraction(0);

    }
}
