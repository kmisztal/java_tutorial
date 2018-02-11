## Zadanie 1

Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz użyć istniejącej metody *java.lang.Math.sqrt()*. Jeśli użytkownik poda liczbę ujemną rzuć wyjątek *java.lang.IllegalArgumentException*. Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą. Zobacz <http://javastart.pl/static/category/wyjatki/>.

## Zadanie 2

Przeanalizuj i uruchom poniższy kod.

```java
class MyException extends Throwable {
    private int a, b;

    MyException (int x, int y) {
        a = x; b = y;
    }
    
    public String toString() {
        return "Moj Wyjatek[" + a + "," + b + "]";
    }
}


class Wyjatki {
    static int f(int a, int b) throws MyException {
        if (a/b == 2) throw new MyException(a,b);
        return a/b;
    }
    
    public static void main (String args[]) {
        int a = 7, b = 3;
        try {
            System.out.println("a/b = " + f(a,b));
        } catch (MyException e) {
            System.out.println("w catch " + e);
        }
    }
}
```

## Zadanie 3

Uzupełni poniższy kod w taki sposób aby można było sortować instancje klasy **Fruit** rosnąco/malejąco ze względu na ilość.

```java
import java.util.Arrays;


class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }
    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(Fruit compareFruit) {
        // ???
    }
}

public class SortFruitObject{

    public static void main(String args[]){

        Fruit[] fruits = new Fruit[4];

        Fruit pineappale = new Fruit("Pineapple","Pineapple description",70);
        Fruit apple = new Fruit("Apple","Apple description",100);
        Fruit orange = new Fruit("Orange","Orange description",80);
        Fruit banana = new Fruit("Banana","Banana description",90);

        fruits[0]=pineappale;
        fruits[1]=apple;
        fruits[2]=orange;
        fruits[3]=banana;

        Arrays.sort(fruits);

        int i=0;
        for(Fruit temp: fruits){
           System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
    }
}
```

