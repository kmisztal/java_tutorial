public class Prod {
    public static void main(String[] args) {
        System.out.println(prod(2));
        System.out.println(prod(2,3));
        System.out.println(prod(2,3,5));
        System.out.println(prod(2,3,5,7));
        System.out.println(prod(2,3,5,7,11));
        System.out.println(prod(2,3,5,7,11,13));
    }
    //int [] a = ...;
    public static int prod(int x, int ... a){
        int ret = x;
        for (int val: a) {
            ret *= val;
        }
        return ret;
    }

//    private static int prod(int i, int i1, int i2, int i3, int i4) {
//        return prod(i, i1, i2, i3, i4, 1);
//    }
//
//    private static int prod(int i, int i1, int i2, int i3, int i4, int i5) {
//        return i * i1 * i2 *i3 * i4 * i5;
//    }
}
