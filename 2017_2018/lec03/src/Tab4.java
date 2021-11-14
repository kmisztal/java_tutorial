public class Tab4 {
    public static int iloczyn(int a, int b){
        return a * b;
    }
    public static int iloczyn(int a, int b, int c){
//        return a * b * c;
        return iloczyn(iloczyn(a, b), c);
    }
//    public static int iloczyn(int a, int b, int c, int d){
////        return a * b * c;
//        return iloczyn(iloczyn(a, b), c);
//    }
    public static int iloczyn(int ... x){
        int ret = 1;
        for (int i = 0; i < x.length; i++) {
            ret *= x[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(iloczyn(2, 3));
        System.out.println(iloczyn(2, 3, 4));
        System.out.println(iloczyn(2, 3, 4, 5, 90, 788));
//        public static int iloczyn(int [] x){
//        System.out.println(iloczyn(new int[]{2, 3, 4, 5} ));
    }
}
