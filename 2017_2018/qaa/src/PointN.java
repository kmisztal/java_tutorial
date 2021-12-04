import java.util.Arrays;

public class PointN {
    private final double[] x;

    public PointN(double ... x){
        this.x = x;
    }

    public static void main(String[] args) {
        PointN p1 = new PointN(12);
        PointN p2 = new PointN(32, 43);
        PointN p3 = new PointN(32, 43, 2, 4, 2);
        PointN p4 = new PointN(32, 43, 1, 4, 2);
        System.out.println(p3);
        System.out.println(p3.dist(p4));
    }

    public int dim(){
        return this.x.length;
    }

    public double dist(PointN a){
        if(this.dim() != a.dim()){
            throw new RuntimeException("Dim not match");
        }
        double result = 0;
        for(int i = 0; i < this.dim(); i++){
            result += Math.pow(a.get(i) - this.get(i), 2.);
        }
        return Math.sqrt(result);
    }

    public double get(int pos){
        if(pos >= 0 && pos < this.dim())
            return this.x[pos];
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return Arrays.toString(x);
    }
}
