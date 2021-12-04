/**
 * Zaimplementuj klasę Point będącą obiektową reprezentacją
 * punktu na płaszczyźnie.
 *
 * klasa ma dwa pola x i y typu double
 * klasa ma konstruktor bezargumentowy tworzący punkt (0,0)
 * klasa ma konstruktor przyjmujący współrzędne x i y
 * zaimplementuj własną wersję metody toString(), aby punkt był wypisywany jako np. [10,-1]
 * klasa ma metodę oblizającą odległość pomiedzy dwoma punktami
 * statyczną metodę liczącą odległość pomiedzy dwoma obiektami klasy Point
 */


public class Point {
    private double x, y;
    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        System.out.println("Ktoś czyta");
        return x;
    }

    public void setX(double x) {
        System.out.println("Ktoś ustawia");
        this.x = x;
    }

    @Override
    public String toString() {
        return "[" + this.getX() + "," + y + ']';
    }

    public static double dist(Point a, Point b){
        return Math.sqrt(
                Math.pow(b.x - a.x, 2)
                + Math.pow(b.y - a.y, 2)
        );
    }

    public double dist(Point b){
        return Math.sqrt(
                Math.pow(b.x - this.x, 2)
                        + Math.pow(b.y - this.y, 2)
        );
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.x);
        System.out.println(point.y);
        Point point1 = new Point(1, 2);
        System.out.println(point1.x + " " + point1.y);
        System.out.println(point1);
        System.out.println(point1.toString());
        System.out.println(Point.dist(point, point1));
        System.out.println(point.dist(point1));
    }
}
