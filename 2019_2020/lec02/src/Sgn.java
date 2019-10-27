import java.util.Scanner;

public class Sgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), result;
        result = sgn(x);
        System.out.println(result);
    }
    public static int sgn(double x){
        int result;
        if(x < 0){
            result = -1;
        }else if(x == 0){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }
}
