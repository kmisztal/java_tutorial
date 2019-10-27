import java.util.concurrent.TimeUnit;

public class Start {
    public static void start(int beg_val) throws InterruptedException {
        for(int i = 0; i < beg_val; ++i){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("START!");
    }

    public static void main(String[] args) throws InterruptedException {
        start(10);
    }
}
