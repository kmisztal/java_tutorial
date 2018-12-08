# Programowanie obiektowe w Javie - lec05



# Pradygmay programowania obiektowego

**Abstrakcja**

Każdy obiekt w systemie służy jako model abstrakcyjnego "wykonawcy", który może wykonywać pracę, opisywać i zmieniać swój stan, oraz komunikować się z innymi obiektami w systemie, bez ujawniania, w jaki sposób zaimplementowano dane cechy.

**Enkapsulacja**

Czyli ukrywanie implementacji, hermetyzacja. Zapewnia, że obiekt nie może zmieniać stanu wewnętrznego innych obiektów w nieoczekiwany sposób. Tylko wewnętrzne metody obiektu są uprawnione do zmiany jego stanu. Każdy typ obiektu prezentuje innym obiektom swój "interfejs", który określa dopuszczalne metody współpracy. Pewne języki osłabiają to założenie, dopuszczając pewien poziom bezpośredniego (kontrolowanego) dostępu do "wnętrzności" obiektu. Ograniczają w ten sposób poziom abstrakcji.

**Polimorfizm**

Referencje i kolekcje obiektów mogą dotyczyć obiektów różnego typu, a wywołanie metody dla referencji spowoduje zachowanie odpowiednie dla pełnego typu obiektu wywoływanego. Jeśli dzieje się to w czasie działania programu, to nazywa się to późnym wiązaniem lub wiązaniem dynamicznym. Niektóre języki udostępniają bardziej statyczne (w trakcie kompilacji) rozwiązania polimorfizmu - na przykład szablony i przeciążanie operatorów w C++.

**Dziedziczenie**

Porządkuje i wspomaga polimorfizm i enkapsulację dzięki umożliwieniu definiowania i tworzenia specjalizowanych obiektów na podstawie bardziej ogólnych. Dla obiektów specjalizowanych nie trzeba redefiniować całej funkcjonalności, lecz tylko tę, której nie ma obiekt ogólniejszy. W typowym przypadku powstają grupy obiektów zwane klasami, oraz grupy klas zwane drzewami. Odzwierciedlają one wspólne cechy obiektów.



# Typ wyliczeniowy `Enum`

`Enum` pozwala na definiowane wybranego zbioru możliwych wartości.

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
```

Wykorzystanie klasy:

```java
public class EnumTest {
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;                         
            case SATURDAY: 
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
```

`Enum` może mieć konstruktor, ale musi on być prywatny

```java
public enum Kolor {
 
    CZERWONY(false), 
    ZIELONY(true), 
    NIEBIESKI(true);
 
    boolean ladny;
 
    private Kolor(boolean czyLadny) {
        ladny = czyLadny;
    }
}
```



> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html



# Dziedziczenie

Dziedziczenie to podstawowy mechanizm programowania obiektowego. Dzięki niemu możemy utworzyć spójną i łatwą do zrozumienia hierarchię klas, a to uczyni nasz kod bardziej przejrzystym i bardziej podatnym na późniejsze modyfikacje. Dziedziczenie jak sama nazwa wskazuje powoduje przekazanie pewnych cech innym klasom. Najprościej wyobrazić to sobie jako model rodziny. Dziadkowie to klasa bazowa, rodzice dziedziczą pewne cechy po dziadkach takie jak kolor oczu, wygląd - u nas byłyby to pola i metody. Dzieci z kolei mogą dziedziczyć od rodziców podobne cechy. Klasy potomne w Javie oprócz przejmowania pewnych cech mogą je także rozszerzyć i dlatego warto ich używać. Zaoszczędzi to nam pisania wielu identycznych linii kodu.

W języku Java w przeciwieństwie do innych nie występuje dziedziczenie wielokrotne. To znaczy, że klasa potomna może rozszerzać tylko jedną klasę bazową. Projektanci Javy uznali, że mechanizm taki jest prostszy i nie wprowadza niepotrzebnego chaosu.

> Wszystkie klasy w Javie dziedziczą po klasie `Object`

Dziedziczenie generuje tak na prawdę drzewko

![Drzewo dziedziczenia](https://docs.oracle.com/javase/tutorial/figures/java/classes-object.gif)

Dziedzienie w Javie realizowane jest przez użycie słowa `extends`, np.:

```java
class A extends B{
}
```



#### Przykład

Klasa Pracownik posiada 3 pola określające imię i nazwisko pracownika a także jego wypłatę. Do tworzenia obiektów dostępne są dwa konstruktory, jeden bezparametrowy, a drugi ustawiający odpowiednie pola obiektu.

```java
class Pracownik{
    String imie;
    String nazwisko;
    int wyplata;
 
    public Pracownik(){
        imie = "";
        nazwisko = "";
        wyplata = 0;
    }
 
    public Pracownik(String i, String n, int w){
        imie = i;
        nazwisko = n;
        wyplata = w;
    }
}
```

Klasa Szef rozszerza klasę Pracownik o dodatkowe pole premia. W życiu codziennym w prawdzie zwykły pracownik też może ją otrzymać, ale załóżmy, że nie. Oczywiście obiekty typu Szef będą przechowywały także podstawowe odziedziczone dane, czyli imię, nazwisko i wypłatę. 

```java 
class Szef extends Pracownik{
    int premia;
}
```

Zobaczmy więc jak to działa:

```java
public class Firma{
 
    public static void main(String args[]){
        Pracownik prac = new Pracownik("Wlodek", "Zięba", 3000);
        System.out.println("Imię: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wypłata: "+prac.wyplata+"\n");
 
        //najpierw stwórzmy domyślny obiekt klasy Szef korzystając z domyślnego konstruktora
        //odziedziconego z klasy Pracownik
        Szef szef = new Szef();
 
        //zobaczmy jak wyglądają odpowiednie pola
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");
 
        //teraz ustawiamy dane szefa
        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);
    }
}
```



### Kolejność wywoływania konstruktorów

Najepierw wywoływany jest konstruktor klasy bazowej a potem pochodnej. W klasie bazowej musi znaleźć się odpowiedni konstruktor, który pasuje kontekstowo.

```java
class A{
  A(){
    System.out.println("Konstruktor A");
  }
}

class B extends A{
  B(){
    System.out.println("Konstruktor B");
  }
}
```

w efekcie dostaniemy 

```bash
Konstruktor A
Konstruktor B
```

### `super`

Słowo `super` pozwala na dostęp do metod klasy bazowej (nadrzędnej).

```java
class A {
  int x;
  A(int x){
    this.x = x;
  }
  
  @Override
  String toString(){
    return "x: " + this.x;
  }
  
}

class B extends A {
  int y;
  B(int x, int y){
    super(x); // wywołanie konstruktora klasy bazowej
    this.y = y;
  }
  
  @Override
  String toString(){
    return super.toString() + " y: " + this.y; // wywołanie metody z klasy bazowej
  }
}
```



# Polimorfizm



```java
public class Shape {
   void draw(){
   }
}
```



```java
class Circle extends Shape {
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
}
```



```java
class Rectangle extends Shape {
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
}
```



```java
class Shapes {
   public static void main(String[] args) {
      Shape[] shapes = { new Circle(10, 20, 30),
                         new Rectangle(20, 30, 40, 50) };
      for (int i = 0; i < shapes.length; i++)
         shapes[i].draw();
   }
}
```

> Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html





