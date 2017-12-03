/**
 * Created by krzys on 03.12.2017.
 */
public class FunctionInto {
    public static double t_F(double t_C){
        return 32 + 9./5 * t_C;
    }
    public static double t_F(double t_C, boolean t){
        return 32 + 9./5 * t_C;
    }

    public static void main(String[] args) {
        System.out.println(t_F(100));
        System.out.println(t_F(0));
        System.out.println(   t_F(30 )     );

        double cel = 20;
        double far = t_F(cel);
        System.out.println(far);


//        double t_F,
//                t_C = 100;
//        t_F = 32 + 9./5 * t_C;
//        System.out.println(t_F);
//
//        t_C = 0;
//        t_F = 32 + 9./5 * t_C;
//        System.out.println(t_F);
//
//        t_C = 30;
//        t_F = 32 + 9./5 * t_C;
//        System.out.println(t_F);
    }
}
