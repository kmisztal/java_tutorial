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



