package cl;

public class Ułamek3 {
    int licznik;
    int mianownik = 1;

    public Ułamek3(int a, int b) {
        licznik = a;
        if(b == 0){
            throw new ArithmeticException("Dzielenie przez zero / mianownik == 0");
        }
        mianownik = b;
    }

    public Ułamek3(int a) {
        licznik = a;
    }

    public static void main(String[] args) {
        Ułamek3 a = new Ułamek3(2, 3);
        System.out.println(a);
        Ułamek3 c = new Ułamek3(5);
        System.out.println(c);
//        Ułamek3 b = new Ułamek3(2, 0);
//        System.out.println(b);
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }
}
