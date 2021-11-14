package functions;

public class Loop2 {

    public static void main(String[] args) {
        int bagCapacity = 15;
        int i = 0;
        while (bagCapacity != 0){
            int k = (int)(10*Math.random());
            System.out.println("iteracja="+i++);
            System.out.println("wylosowano k="+k);
            System.out.println("bag przed "+bagCapacity);
            if(bagCapacity-k<0){
                System.out.println("nie mogę tego dodać do plecaka");
                continue;
            }
            bagCapacity -= k;
            System.out.println("bad po "+bagCapacity);
            System.out.println("------------");
        }

        // 2.
//        do{
//
//        }while ();
//
//        // 1.
//        while (){
//
//        }
//
//        // 0.
//        for( ; ; ){
//
//        }
    }
}
