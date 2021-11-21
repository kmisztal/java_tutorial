package cl;

public class Ułamek2 {
    // 3. czy 0 w mianiownku jako domyślne jest ok?
    int licznik;
    int mianownik = 1;

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }

    public static void main(String[] args) {
        Ułamek2 a = new Ułamek2();
        // 1.
        System.out.println(a);
        // 2.
        System.out.println(a.licznik);
        System.out.println(a.mianownik);
        a.licznik = 2;
        a.mianownik = 3;
        System.out.println(a);
    }
}
