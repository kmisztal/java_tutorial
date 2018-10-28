package objects;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(rand.nextDouble());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextInt(12));
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextDouble()*10-5);
    }

}
