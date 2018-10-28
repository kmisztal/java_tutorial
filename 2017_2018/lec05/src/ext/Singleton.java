package ext;

class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}


class Test{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}