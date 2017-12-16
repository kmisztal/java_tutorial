# Programowanie obiektowe w Javie - lec04





# Obiekty i klasy

### Klasy

Klasa jest szablonem. Opisuje jakiś wycinek rzeczywistości. Konkretnym wypełnieniem
szablonu jest obiekt. Każdy obiekt posiada swój stan, który czasami jest nazywany zbiorem
własności. Czyli z każdym obiektem związane są jakieś dane. Dodatkowo z obiektem
możemy wykonywać jakieś akcje, które definiują metody. 

![Circle](E:\github\java_tutorial\lec04\images\Circle.png)

To jest schemat klasy w języku UML (języku służącym do modelowania różnego rodzaju systemów). Na powyzszym obrazku widać, że klasa **Circle** składa się z:

- Pola: 
  - *radius* o typie *double* przechowującego za pewne długość promienia
- Metod:
  - *getPerimeter()* - zwraca obwód koła
  - *getArea()* - zwraca pole koła 
  - *getRadius()* - zwraca promień
  - *setRadius(double)* - ustawia promień
- ... oraz dwóch metod specjalnych zwanych konstruktorami
  - *Circle()*
  - *Circle(double)*


Tak wygląda to wizualnie, natomiast w praktyce to doskonale Państwo wiecie, że stoją sa tym


- Pola: 
  - *radius* o typie *double* przechowującego za pewne długość promienia

    ```java
    double radius;
    ```

- Metod:
  - *getPerimeter()* - zwraca obwód koła

    ```java
    double getPerimeter(){
      return 2 * Math.PI * radius;
    }
    ```

  - *getArea()* - zwraca pole koła 

    ```java
    double getArea(){
      return Math.PI * radius;
    }
    ```

  - *getRadius()* - zwraca promień

    ```java
    double getRadius(){
      return radius;
    }
    ```

  - *setRadius(double)* - ustawia promień

    ```java
    void setRadius(double new_radius){
      radius = new_radius;
    }
    ```

- Konstruktory z kolei to specjalne metody, których nazwa jest zgodna z nazwą klasy i ich zadaniem jest odpowiednie utworzenie obiektów klasy, w naszym przypadku konstruktory mogą wyglądać np. tak:


  - *Circle()* - tak zwany konstruktor bezargumentowy

    ```java
    Circle(){
      radius = 0;
    }
    ```

  - *Circle(double)* - drugi konstruktor, konstruktorów może być dowolnie dużo

    ```java
    Circle(double r){
      radius = r;
    }
    ```

Cała klasa wygląda np. tak

```java
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
}

```

> Do przejrzenia:
> https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html
> https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
> https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
> https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
>

### Tworzenie obiektów klasy

Do tworzenia obiektów używamy specjalnych metod zwanych **konstruktorami** aby utworzyć mowy obiekt należy wykorzystać operator `new`, np.:

```java
new Circle(); // tworzy nowy obiekt

Circle a; // tworzy zmienną mogącą przechowywać obiekty typu Circle, 
          // tak na prawdę tworzy pustą referencję

Circle b = new Circle(); // definicja zmiennej oraz inicjalizacja (utworzenie obiektu)

```

> **Uwaga:** Jeśli chodzi o biekty to mamy do czynienia z referencjami (dowiązaniami) obiektów w pamięci.
>
> Wówczas:
>
> ```java
> Circle a = new Circle();
> Circle b = a;
> ```
>
> w tym przypadku zmienne `a` i `b` wskazują na ten sam obiekt, więc każda jego zmiana wykonana w np. zmiennej `a` będzie miała odzwierciedlenie w zmiennej `b`.

> Do przejrzenia: 
> https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html
> https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
> https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html

### `null`

`null` to specjalne słowo Javy określające, że dana zmienna nie wskazuje na żaden obiekt, np.:

```java
Circle c = null;
```

uwaga, bo wtedy użycie:

```java
System.out.println(c.getRadius());
```

spowoduje wystąpienie błędu `NullPointerException`.



### Konstruktor domyślny

- Jeśli nie stworzymy żadnego konstruktora, Java wygeneruje kostruktor domyślny (bezargumentowy). 

  ```java
  class A{
    double val = 7;
    int mark;
  }

  class Run1 {
    public static void main(String ... args){
      new A(); //wywołanie konstruktora domyślenego klasy A
      
      A x = new A();
      System.out.println(x.val); // wypisze: 7
      System.out.println(x.mark); // wypisze: 0 (bo wartość pola w klasie wypełniana jest 
                                  // domyślenie zerem. Patrz następny akapit)
    }
  }
  ```

  ​

- Jeśli utworzymy jakiś konstruktor to Java nie będzie generować konstruktora domyślenego.

  ```java
  class B{
    int val;
    B(int v){
      val = v;
    }
  }

  class Run2{
    public static void main(String ... args){
      new B(); // BŁĄD, nie ma takiego konstruktora
      
      new B(5); // ok, jest taki konstruktor
    }
  }
  ```

  ​

### Pola klasy

Pola klasy inicjalizowane są domyślnymi wartościami

```
Typ danych              Wartość domyślna dla pól klasy
byte                    0 
short                   0   
int                     0 
long                    0L 
float                   0.0f 
double                  0.0d 
char                    '\u0000' 
boolean                 false
String (or any object)  null 
```

chyba, że wprowadzono ich wartości *startowe*

```java
class A{
  double val = 7;
  int mark;
}

class Run1 {
  public static void main(String ... args){
    new A(); //wywołanie konstruktora domyślenego klasy A
    
    A x = new A();
    System.out.println(x.val); // wypisze: 7
    System.out.println(x.mark); // wypisze: 0 
  }
}
```

> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html



### ```static```

Słowo `static` oznacza statyczny. Statyczne mogą być metody i pola. Są to elementy, które są współdzielone przez wszystkie obiekty danej klasy.

W obrębie klasy:

- Metody statyczne mogą korzystać tylko z innych metod statycznych i pól statycznych danej klasy. 	
- Metody niestatyczne mogą korzystać z wszystkiego co jest w klasie.

Idealnym przykładem użycia słowa `static` może być klasa `Math`:

```java
public class MathExample {
    public static void main(String[] args) {
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045
        double sin = Math.sin(Math.PI/2);
        System.out.println(sin); // 1.0
 
        double a = 5.6;
        int b = (int) a;
        long round = Math.round(a);
        System.out.println(b); // 5
        System.out.println(round); // 6
         
        double minus = -10;
        double abs = Math.abs(minus);
        System.out.println(abs); // 10.0
         
        double power = Math.pow(2, 4);
        System.out.println(power); // 16.0 (2^4)
        System.out.println(Math.sqrt(power)); // 4.0 (pierwiastek kwadratowy z 16)
    }
}
```



### `this`

#### `this` z nazwami pól

Rozważmy klasę:

```java
public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
```
W przypadku konstruktora mamy ciekawą kostrukcję w której nasze lokalne zmienne są przepisywane do pól klasy. Moglibysmy te argumenty znawać w związku z tym tak jak pola klasy, ale wtedy każdy argument konstruktora przesłaniałby pole klasy i zapisanie informacji by nie nastąpiło. Aby nam się udało należy wykorzystać słówko `this`, np.:

```java
public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

Wówczas mówimy, że `this.x` pochodzi z aktualnego obiektu, a `x` to argument konstruktora.

W tym kontekście słowa `this` przydaje się w wielu przypadkach.


#### `this` w kostruktorach

W konstruktorach możemy wywoływać inne konstruktor tej samej klasy, np.

```java
class Rectangle {
    int x, y;
    int width, height;
        
    Rectangle() {
        this(0, 0, 1, 1);                // <----------
    }
    Rectangle(int width, int height) {
        this(0, 0, width, height);       // <----------
    }
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // ...
}
```

W tym przypadku, dwa pierwsze konstruktory wykorzystując kostruktor trzeci do tego aby poprawnie utworzyć obiekt.

> **Uwaga:** Jeśli w kostroktorze chcemy wywołać inny konstruktor tej samej klasy to musimy to zrobić w pierwszej linii tego konstruktora.

> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html



### Pakiety

Pakiety jest to mechanizm, który pozwala uporządkować kod napisany w Javie. W praktyce każda klasa znajduje się w pakiecie. O przynależności do pakietu świadczą dwie rzeczy:

- w naglówku (na początku) pliku piszemy

  ```java
  package nazwa.pakietu;
  ```

- umieszczenie pliku w odpowiednim katalogu, u nas np. pakiet `nazwa.pakietu` znajduje się w folderze `src/nazwa/pakietu`.

Oba te warunki muszą być spełnione jednocześnie.



### Modyfikatory dostępu

Mamy zasadniuczo 4 rodzaje modyfikatorów dostępu:

- `public` - pole i metoda z takim modyfikatorem jest widoczna wszędzie, we wszystkich klasach.
- brak modyfikatora - ogranicza dostęp tylko dla klas znajdujących się w tym samym pakiecie.
- `private` - pole i metoda są widoczne tylko w obębie danej klasy.
- `protected` - pole i metody sa widoczne w obrębie jednej klasy i klas potomnych.

Przykład:

```java
public class Circle {
    private double radius;

    public Circle() {        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

```

| **Modyfikator** dostępu | Klasa | Pakiet | Podklasa | Świat |
| ----------------------- | ----- | ------ | -------- | ----- |
| `public`                | TAK   | TAK    | TAK      | TAK   |
| `protected`             | TAK   | TAK    | TAK      | NIE   |
| brak modyfikatora       | TAK   | TAK    | NIE      | NIE   |
| `private`               | TAK   | NIE    | NIE      | NIE   |

> Zalecane postępowanie:
>
> - używaj `private` chyba, że masz dobry powód by tego nie robić
> - unikaj `public` w stosunku do pól, chyba, że są to pola st

> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

### Przekazywanie obiektów do metody a przekazywanie zmiennych typu prostego

> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html