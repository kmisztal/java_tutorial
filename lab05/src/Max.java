
public class Max {
    public static double max(double ... tab){
        double ret = tab[0];

        for (double a: tab) {
            if(ret < a){
                ret = a;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 0.3, 7, -20.1));
        System.out.println(max(-4, -.21, 0.21));
    }
}
