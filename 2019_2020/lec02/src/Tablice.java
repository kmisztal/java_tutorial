import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        int [] a = {11, -2, 65, 114};
//        System.out.println(a.length);
//        a[2] = 12222;
//        System.out.println(a[2]);
        for(int i = 0; i < a.length; ++i){
            System.out.println(a[i]);
        }

        for(int v: a){
            System.out.println(v);
        }

        System.out.println(Arrays.toString(a));
    }
}
