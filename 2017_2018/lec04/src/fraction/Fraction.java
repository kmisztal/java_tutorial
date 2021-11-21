package fraction;

public class Fraction {
    final int numerator;
    final int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0)
            throw new ArithmeticException("denominator is zero");

        if(denominator < 0){
            denominator *= -1;
            numerator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
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

    public Fraction add(Fraction b){
        return new Fraction(
                this.numerator * b.denominator
                        + b.numerator * this.denominator,
                this.denominator * b.denominator
        );
    }

//    public Fraction addTo(Fraction b){
//        this.numerator = this.numerator * b.denominator
//                        + b.numerator * this.denominator;
//        this.denominator = this.denominator * b.denominator;
//        return this;
//    }

    @Override
    public String toString() {
        if (denominator == 1)
            return "" + numerator;
        return numerator + "/" + denominator;
    }
}
