public class Silnia {
    public static void main(String[] args) {
        for(int k = 0; k < 30; k++)
            System.out.println(k + "! = " + silnia(k));
    }

    public static long silnia(long n){
        if(n == 0){
            return 1;
        }else{
            return n * silnia(n-1);
        }
    }

    public static int silnia2(int n){
       return n == 0 ? 1 : n * silnia2(n-1);
    }

}
