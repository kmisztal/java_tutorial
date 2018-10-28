package enums;

public enum Kolor {

    CZERWONY(){
        @Override
        public void f(){
            System.out.println("NIEEEEE");
        }
    },
    ZIELONY(true),
    NIEBIESKI(true);

    boolean ladny;

    private Kolor(boolean czyLadny) {
        ladny = czyLadny;
    }

    private Kolor(){

    }

    public void f(){
        System.out.println("Hurra");
    }

    public static void main(String[] args) {
        System.out.println(Kolor.CZERWONY.ladny);

        for (Kolor k : Kolor.values()){
            System.out.println(k);
            k.f();
        }
    }
}
