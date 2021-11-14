package functions;

public class Loop {

    public static void main(String[] args) {
        int bagCapacity = 15;
        for(int i = 0; i < 10; i++){
            int k = (int)(10*Math.random());
            System.out.println("iteracja="+i);
            System.out.println("wylosowano k="+k);
            System.out.println("bag przed "+bagCapacity);
            if(bagCapacity-k<0){
                System.out.println("nie mogę tego dodać do plecaka");
                continue;
            }
            bagCapacity -= k;
            System.out.println("bad po "+bagCapacity);
            System.out.println("------------");
            if(bagCapacity == 0){
                System.out.println("bag jest pełny");
                break;
            }
        }
    }
}
