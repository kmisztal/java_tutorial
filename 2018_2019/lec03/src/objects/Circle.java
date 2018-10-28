package objects;

public class Circle {
    double radius;

    Circle() {
        radius = 0;
    }

    Circle(double r) {
        radius = r;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double new_radius) {
        radius = new_radius;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        a = 7;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------");

        Circle c1 = new Circle(10);
        Circle c2 = c1;
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        c1.setRadius(13);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());


        Circle c = null;
        System.out.println(c.getRadius());


        Circle x = new Circle(123);
    }
}
