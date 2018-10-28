/**
 * Created by zp113409 on 03.12.2017.
 */
public class Temperature {
    public static void main(String[] args) {

        System.out.println(t_F(0));
        System.out.println(t_F(100));

//      double tF, tC = 30;
//      System.out.println(32 + 9./5*tC);

//      32 F = 0 C;
//      212 F = 100 C;

    }
        public static double t_F (double t_C){
        return 32 + 9./5*t_C;
    }

}
