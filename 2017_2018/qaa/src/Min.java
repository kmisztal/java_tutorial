public class Min {
    public static double min_pos(double[] tab){
        int pos = 0;
        double min = tab[0];//Double.MAX_VALUE;

        for (int i = 1; i < tab.length; i++) {
            if(tab[i] < min){
                min = tab[i];
                pos = i;
            }
        }
        return pos;
    }
    public static double min(double[] tab){
        double min = tab[0];//Double.MAX_VALUE;

        for (double d: tab) {
            if(d < min){
                min = d;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        double[] a = {1, 2, 3, -3};
        System.out.println(min_pos(a));
        System.out.println(min(a));
    }
}
