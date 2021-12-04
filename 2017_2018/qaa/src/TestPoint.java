public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(1, 3);
        System.out.println(p);
        System.out.println(p.getX());
        p.setX(-1);
        System.out.println(p.getX());
    }
}
