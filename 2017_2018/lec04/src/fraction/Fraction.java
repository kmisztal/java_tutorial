package fraction;

public class Fraction {
    int numerator;
    int denominator;

    @Override
    public String toString() {
        if (denominator == 1)
            return "" + numerator;
        return numerator + "/" + denominator;
    }
}
