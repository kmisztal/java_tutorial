package objects;

class A{
    double val = 7;
    int mark;
}

public class Run1 {
    public static void main(String ... args){
        new A(); //wywołanie konstruktora domyślenego klasy A

        A x = new A();
        System.out.println(x.val); // wypisze: 7
        System.out.println(x.mark); // wypisze: 0 (bo wartość pola w klasie wypełniana jest
        // domyślenie zerem. Patrz następny akapit)
    }
}