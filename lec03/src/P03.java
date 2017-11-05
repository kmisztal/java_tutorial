/**
 * Created by krzys on 04.11.2017.
 */
public class P03 {
    public static void main(String[] args) {
//        int i = 0;
//        while(i < 3){
//            System.out.println("Hello world!");
//            ++i;
//        }

        for(int j = 0;  ; ){
            System.out.println(j + " Hello world!");
            ++j;

            if( !(j < 3) ){
                break;
            }
        }

        int i = 0;
        while(true){
            System.out.println("Hello world!");
            ++i;
            if(!(i < 3)){
                break;
            }
        }
    }
}
