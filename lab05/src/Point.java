public class Point {
    private double x, y;

    public Point(){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "["+this.x+","+this.y+"]";
    }

    public static void main(String[] args) {
        Point p = new Point(1, 100);
        Point q = new Point(1, 2);
        System.out.println(p);
        System.out.println(p.dist(q));
    }

    public double dist(Point p) {
//        return Math.sqrt(
//                Math.pow(this.x - p.x, 2.)
//                +
//                Math.pow(this.y - p.y, 2.)
//        );
        return dist(this, p);
    }
    public static double dist(Point a, Point b){
        return Math.sqrt(
                Math.pow(a.x - b.x, 2.)
                +
                Math.pow(a.y - b.y, 2.)
        );
    }
}
