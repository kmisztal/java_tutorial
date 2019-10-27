public class For {
    public static void main(String[] args) {
        int i = 0;
        for(;i < 5;++i){
            if(i % 2 != 0)
                continue;
            System.out.println("i = " + i);
        }

//        for(int i = 0, b = -1; i < 5 && b < 0; ++i, b=b-10){ // uwaga pętla nieskończona
//            System.out.println("OK");
//            System.out.println("Nie OK");
//        }

//        for(int i = 0; i < 5; ++i){
//            System.out.println("OK");
//            System.out.println("Nie OK");
//        }
    }
}
