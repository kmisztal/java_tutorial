package fraction;

public class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0)
            throw new ArithmeticException("denominator is zero");
        this.denominator = denominator;
        if(this.denominator < 0){
            this.denominator *= -1;
            this.numerator *= -1;
        }
    }

    public Fraction(int numerator){
        this(numerator, 1);
    }

    public static Fraction add(Fraction a, Fraction b){
        return new Fraction(
                a.numerator * b.denominator
                        + b.numerator * a.denominator,
                a.denominator * b.denominator
        );
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return "" + numerator;
        return numerator + "/" + denominator;
    }
}
