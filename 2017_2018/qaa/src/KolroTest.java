enum Kolor {
    CZERWONY(false){
        @Override
        void f() {

        }
    },
    ZIELONY(true){
        @Override
        void f() {

        }
    },
    NIEBIESKI(true){
        @Override
        void f() {

        }
    };

    boolean ladny;

    Kolor(boolean czyLadny) {
        ladny = czyLadny;
    }

    abstract void f();
}

public class KolroTest {
    public static void main(String[] args) {
        Kolor m = Kolor.CZERWONY;
        System.out.println(m);
        System.out.println(m.ladny);
    }

}
