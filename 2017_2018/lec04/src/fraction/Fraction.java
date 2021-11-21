package fraction;

public class Fraction {
    final int numerator;
    final int denominator;
    // A
    final static Fraction ZERO = new Fraction(0);
    final static Fraction ONE = new Fraction(1);

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

    // B
    public static Fraction of(int numerator, int denominator){
        return new Fraction(numerator, denominator);
    }

    public static Fraction of(int numerator){
        return new Fraction(numerator);
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

    public static Fraction sub(Fraction a, Fraction b){
        return new Fraction(
                a.numerator * b.denominator
                        - b.numerator * a.denominator,
                a.denominator * b.denominator
        );
    }

    public Fraction sub(Fraction b){
        return new Fraction(
                this.numerator * b.denominator
                        - b.numerator * this.denominator,
                this.denominator * b.denominator
        );
    }

    public static Fraction mult(Fraction a, Fraction b){
        return new Fraction(
                a.numerator * b.numerator,
                a.denominator * b.denominator
        );
    }

    public Fraction mult(Fraction b){
        return new Fraction(
                this.numerator * b.numerator,
                this.denominator * b.denominator
        );
    }

    public static Fraction div(Fraction a, Fraction b){
        return new Fraction(
                a.numerator * b.denominator,
                a.denominator * b.numerator
        );
    }

    public Fraction div(Fraction b){
        return new Fraction(
                this.numerator * b.denominator,
                this.denominator * b.numerator
        );
    }

    public double toDouble(){
        return 1. * this.numerator / this.denominator;
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
