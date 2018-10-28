package ext;

class Zwierze {
    public void jedz() {
        for (int i = 0; i < 10; ++i)
            System.out.println("Om Nom Nom Nom");
    }

    public void pij() {
        for (int i = 0; i < 5; ++i)
            System.out.println("Chlip, chlip");
    }

    public void spij() {
        System.out.println("Chrr...");
    }
}

class Pies extends Zwierze{
    public void szczekaj() {
        System.out.println("Hau! Hau...");
    }

    public void warcz() {
        System.out.println("Wrrrrrr...");
    }

    @Override
    public void jedz() {
        for (int i = 0; i < 2; ++i)
            System.out.println("Om Nom Nom Nom");
    }
}

class Tester {
    public static void main(String[] args) {
//        Zwierze z = new Zwierze();
//        z.jedz();
//        z.pij();
//        z.spij();

//        Pies p = new Pies();
//        p.szczekaj();
//        p.warcz();
//        p.jedz();
//        p.pij();
//        p.spij();

        Zwierze zz = new Pies();
        zz.spij();
        zz.pij();
        zz.jedz();

        Pies pp = (Pies)zz;
        if(pp instanceof Pies){
            System.out.println("OK");
        }
        if(zz instanceof Pies){
            System.out.println("OK");
        }
    }
}