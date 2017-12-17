package ext;

abstract class Shape {
    abstract void draw();

    double getRandom(){
        return 1.3;
    }
}

interface Beautiful{
    boolean isNice();
}


interface Bad {
    boolean isBad();
}



class Circle extends Shape implements Beautiful, Bad{
    private int x, y, r;

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // tutaj mamy też metody getX(), getY(), getRadius()

    @Override
    void draw() {
        System.out.println("Drawing circle (" + x + ", "+ y + ", " + r + ")");
    }

    @Override
    public boolean isNice() {
        return true;
    }

    @Override
    public boolean isBad() {
        return false;
    }
}

class Rectangle extends Shape implements Beautiful{
    private int x, y, w, h;

    Rectangle(int x, int y, int w, int h)    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    // tutaj mam też motody getX(), getY(), getWidth(), getHeight()

    @Override
    void draw()   {
        System.out.println("Drawing rectangle (" + x + ", "+ y + ", " + w + "," + h + ")");
    }

    @Override
    public boolean isNice() {
        return false;
    }
}

class Shapes {
    public static void main(String[] args) {
        Beautiful[] shapes = {
                new Circle(10, 20, 30),
                new Rectangle(20, 30, 40, 50)
        };
        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
//            System.out.println(shapes[i].getRandom());
            shapes[i].isNice();
        }

//        Shape s = new Shape();
    }
}
