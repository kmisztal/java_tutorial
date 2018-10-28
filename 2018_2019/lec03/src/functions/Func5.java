package functions;

public class Func5 {
    public static int func(int[] a){
        int ret = 0;
        for(int i : a){
            ret += i * i;
        }
//        for(int k = 0; k < a.length; ++k){
//            ret += a[k] * a[k];
//        }

        return ret;
    }

    public static int random(){
        return 13;
    }

    public static void main(String[] args) {
        int [] x = {1, 3, 4, 5};
        System.out.println(func(x));
    }
}
