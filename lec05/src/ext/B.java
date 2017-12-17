package ext;

class A{
    A(){
        System.out.println("Konstruktor A");
    }
}

public class B extends A{
    B(){
        System.out.println("Konstruktor B");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
