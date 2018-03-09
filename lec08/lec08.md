# Typy generyczne

Dlaczego w poniższym kodzie uzyskujemy ostrzeżenie?
> Note: ShowUncheckedWarning.java uses unchecked or unsafe operations.

```java
public class ShowUncheckedWarning {
  public static void main(String[] args) {
    java.util.ArrayList list = 
      new java.util.ArrayList();
    list.add("Java Programming");
	
	String s = (String) list.get(0);
  }
}
```

Aby usunąć błąd należy sprecyzować jakiego typu elementy będą przechowywane w liście

```java
public class ShowUncheckedWarning {
  public static void main(String[] args) {
    java.util.ArrayList<String> list = 
      new java.util.ArrayList<String>();
    list.add("Java Programming");
	
	String s = list.get(0);   // no cast
  }
}
```
W uproszczeniu można powiedzieć, że typy generyczne są “szablonami”. Dzięki typom generycznym możemy uniknąć np. niepotrzebnego rzutowania. Dzięki nim kompilator jest w stanie sprawdzić poprawność typów na etapie kompilacji, oznacza to więcej błędów wykrytych w jej trakcie.

Typy generyczne umożliwiają parametryzowanie klas, dzięki temu jesteśmy w stanie przygotować szybko ogólny kod.

Dla przykładu poniższy kod zawiera klasy, które wkładane są do pudełek. Jeśli liczba klas by wzrosłą to dla każdej nowej musielibyśmy przygotować nowe pudełko.

```java
class Pie{
    
}

class Chocolate{
    
}

class BoxForAnanas{
    private Pie object;

    public BoxForAnanas(Pie object){
        this.object = object;
    }
    
    public Pie getObject() {
        return object;
    }
}


class BoxForChocolate{
    private Chocolate object;

    public BoxForChocolate(Chocolate object){
        this.object = object;
    }

    public Chocolate getObject() {
        return object;
    }
}
```

Możemy rozwiązać problem bezsensownego pisania pudełek, np. tak:

```java
public class Box<T> {
    private T object;

    public Box(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
```
teraz do pudełka może trafić co tylko chcemy.

## Definicja klasy generycznej

```java
class Name<T1, T2, ..., Tn> {
    /* body */
}
```

Zauważ, że w nawiasach `<>` możemy umieścić więcej niż jeden parametr. Chociaż zgodnie ze specyfikacją języka Java możesz użyć dowolnej nazwy która nadaje się na nazwę zmiennej istnieje konwencja nazewnicza sugerująca nazwy parametrów. Zwyczajowo do tego celu używa się wielkich liter `T`, `K`, `U`, `V`, `E`.

W miejsce parametrów możemy wstawić dowolny obiekt, nie może to jednak być typ prosty. Innymi słowy `Integer` jest w porządku, `int` powoduje błąd.


## Tworzenie obiektów

```java
Box<Pie> pieBox = new Box<Pie>(new Pie());
```

Zarówno przy określaniu typu zmiennej jak i przy wywołaniu konstruktora powtarzamy klasę `Pie`, co jest zbędną duplikacją. Jeśli kompilator jest w stanie “wywnioskować” jaki typ powinien być użyty możemy go pominąć przy konstruktorze.

```java
Box<Pie> pieBox = new Box<>(new Pie());
```

## Bardziej skomplikowany przykład:

```java 
public class Pair<T, S> {
    private T first;
    private S second;
 
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
 
    public T getFirst() {
        return first;
    }
 
    public S getSecond() {
        return second;
    }
}
```

## Ciekawy przykład

```java
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
```

Poniższe wywołania są poprawne:

```java
Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");

OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...));
```

## Metody generyczne

```java
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}
```

Wtedy możemy skorzystać z kodu tak:
```java
Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
boolean same = Util.<Integer, String>compare(p1, p2);
```
lub kazać wykazać sie kompilatorowi
```java
Pair<Integer, String> p1 = new Pair<>(1, "apple");
Pair<Integer, String> p2 = new Pair<>(2, "pear");
boolean same = Util.compare(p1, p2);
```

## `extends`

```java
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    // ...
}
```

```java
Class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

class D <T extends A & B & C> { /* ... */ }
```

## Metody z generycznymi argumentami – wildcard
Pisząc metody, które jako argumenty przyjmują typy generyczne nie zawsze chcesz dokładnie specyfikować typ. W takim wypadku z pomocą przychodzi znak ?, który może akceptować różne typy.
```java
private static void method1(FancyBox<?> box) {
    Object object = box.object;
    System.out.println(object);
}
 
private static void plainWildcard() {
    method1(new FancyBox<>(new Object()));
    method1(new FancyBox<>(new Square()));
    method1(new FancyBox<>(new Apple()));
}
```
Do przejrzenia https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html

## Wildcard upper bound
Znak ? może występować także w połączeniu ze słówkiem kluczowym `extends`. W takim przypadku możesz ograniczyć akceptowane typy “z góry”. Na przykład w przykładzie poniżej metoda akceptuje jedynie klasy typy, które dziedziczą po `Figure`.
```java
private static void method2(FancyBox<? extends Figure> box) {
    Figure figure = box.object;
    System.out.println(figure);
}
 
private static void method3(FancyBox<Figure> box) {
    Figure figure = box.object;
    System.out.println(figure);
}
 
private static void upperBoundWildcard() {
    method2(new FancyBox<>(new Square()));
    method2(new FancyBox<>(new Circle()));
    //method3(new FancyBox<Square>(new Square())); // compilation error
}
```
Do przejrzenia https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html

## Wildcard lower bound

Poza ograniczeniem “z góry” możesz także ograniczyć akceptowalne typy “z dołu”. W przykładzie poniżej metoda akceptuje wyłącznie argumenty typu `FancyBox<Object>`, `FancyBox<Figure>` i `FancyBox<Rectangle>`.

```java
private static void method4(FancyBox<? super Rectangle> box) {
    box.object = new Square();
    //box.object = new Circle(); // compilation error
}
 
private static void lowerBoundWildcard() {
    method4(new FancyBox<>(new Rectangle()));
    method4(new FancyBox<Figure>(new Rectangle()));
    method4(new FancyBox<>(new Object()));
    //method4(new FancyBox<Square>(new Square())); // compilation error
}
```

Do przejrzenia https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html

# Klasy wewnętrzne

Istnieje kilka typów klas wewnętrznych:

- klasy wewnętrzne - najczęstszy przypadek
- statyczne klasy wewnętrzne,
- lokalne klasy wewnętrzne,
- anonimowe klasy wewnętrzne - bardzo popularny przypadek.


## Klasy wewnętrzne
Przykład - zwykła klasa `OuterClass` i klasa wewnętrzna `InnerClass`.

```java
public class OuterClass {
    public class InnerClass {
    }

    public InnerClass instantiate() {
        return new InnerClass();
    }
}
```

Podobnie jak w przypadku atrybutów czy metod, klasy wewnętrzne mogą mieć standardowe modyfikatory dostępu `public`, `protected` czy `private`. Brak modyfikatora dostępu także i tutaj jest poprawny.

Modyfikatory dostępu użyte przed definicją klasy wewnętrznej działają identycznie jak w przypadku atrybutów, metod czy konstruktorów.

### Przykład użycia
Do stworzenia instancji klasy wewnętrznej potrzebujemy instancji klasy zewnętrznej. 
```java
private static void innerClassInstantiation() {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass instance1 = outerClass.instantiate();
    OuterClass.InnerClass instance2 = outerClass.new InnerClass();
}
```
Widzimy, że typ `OuterClass.InnerClass`, to nic innego jak odwołanie się do typu wewnętrznego. W tym fragmencie kodu tworzymy dwie instancje. Pierwsza z nich powstaje w wyniku wywołania metody `instantiate` z klasy `OuterClass`. 


## Statyczne klasy wewnętrzne

W języku Java istnieją także statyczne klasy wewnętrzne. Są to klasy wewnętrzne poprzedzone modyfikatorem `static`

```java
public class OuterClass2 {
    public static class InnerClass2 {
    }   
 
    private InnerClass2 instantiate() {
        return new InnerClass2();
    }   
}
Taka konstrukcja zmienia sposób tworzeniu instancji statycznej klasy wewnętrznej.

> Domyślnie, wszystkie wewnętrzne interfejsy i typy wyliczeniowe są statyczne, modyfikator static jest przed nimi zbędny (możesz spróbować go dodać, IDE powinno zwrócić Ci na to uwagę).

### Przykład
W odróżnieniu od standardowych klas wewnętrznych, nie potrzebujemy instancji klasy zewnętrznej do stworzenia instancji statycznej klasy wewnętrznej. 
```java
private static void staticInnerClassInstantiation() {
    OuterClass2 outerClass = new OuterClass2();
    OuterClass2.InnerClass2 instance1 = outerClass.instantiate();
    OuterClass2.InnerClass2 instance2 = new OuterClass2.InnerClass2();
}
```

## Lokalne klasy wewnętrzne

```java
private static void localClassInstantiation(String[] args) {
    class LocalClass {
        @Override
        public String toString() {
            return "Argumenty metody: " + Arrays.toString(args);
        }
    }   
    LocalClass localClassInstance = new LocalClass();
    System.out.println(localClassInstance);
}
```

Tutaj wewnątrz metody tworzymy naszą lokalną klasę wewnętrzną LocalClass. Linijkę później tworzymy jej instancję i wywołujemy na niej metodę.

Głównym ograniczeniem/zaletą klas lokalnych jest ich zasięg. Podobnie jak w przypadku zmiennych lokalnych, dostęp do klas lokalnych jest wyłącznie w bloku, w którym zostały zdefiniowane.


## Po co to wszystko?

- Klas wewnętrznych używamy w sytuacji, w której klasa wewnętrzna nie ma sensu bez klasy zewnętrznej i jest z nią ściśle związana.
	```java
	Map<String, Integer> dayInMonths = new HashMap<>();
	dayInMonths.put("styczen", 31);
	dayInMonths.put("luty", 28);
	dayInMonths.put("marzec", 31);
	 
	for(Map.Entry<String, Integer> entry : dayInMonths.entrySet()) {
		System.out.println(entry.getKey() + " ma " + entry.getValue() + " dni.");
	}
	```

- Kolejnym powodem może być lepsza enkapsulacja kodu (ukrywanie szczegółów działania klasy wewnątrz). Dzięki temu, że klasy wewnętrzne mają dostęp nawet do prywatnych zasobów klas otaczających, te drugie  możemy bardziej „opakować”. Ukryć więcej szczegółów wewnątrz.

## Klasy anonimowe

Klasy anonimowe to klasy definiowane w kodzie, które mają dokładnie jedną instancję. Definicja klasy anonimowej połączona jest z tworzeniem jej jedynej instancji. Klasy anonimowe zawsze są klasami wewnętrznymi.

```java
public interface GreetingModule {
    void sayHello();
}
 
public void someMethod()
    GreetingModule greeting = new GreetingModule() {
        @Override
        public void sayHello() {
            System.out.println("good morning");
        }
    }
}
```

W powyższym przykładzie kompilator tworzy nową klasę, która implementuje interfejs `GreetingModule`. W tym samym czasie tworzę jej nową instancję przy pomocy słowa kluczowego `new`. Upraszczając, można powiedzieć, że powyższy przykład to skrót:
```java
public interface GreetingModule {
    void sayHello();
}

public class GreetingModuleImpl implements GreetingModule {
    @Override
    public void sayHello() {
        System.out.println("good morning");
    }
}
 
public void someMethod()
    GreetingModule greeting = new GreetingModuleImpl();
}
```
Wewnątrz definicji klasy anonimowej możemy definiować atrybuty czy metody. W praktyce sprowadza się to przeważnie do zaimplementowania metod interfejsu dla którego tworzymy klasę anonimową.

> Uwaga: Jeśli klasa anonimowa implementuje interfejs to kompilator tworzy nową klasę, która implementuje dany interfejs - nie jest to na pewno instancja interfejsu!!!

Do przejrzenia: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

# Wyrażenia lambda - po raz pierwszy

```java
List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
```
aby posortować tę listę można skorzystać z klasy anonimowej
```java
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
});
```
Czy na prawdę, aż tyle kodu jest konieczne? czy łatwo się w nim połapać?

Tak naprawdę interfejs `Comparator` jest interfejsem funkcjynym, tzn. posiada tylko jedną metodę abstrakcyjną tutaj `compare(o1, o2)` więc możemy sobie wyobrazić go jako funkcję, która przyjmuje dwa parametry i zwraca wartość typu `int`:

```
(String o1, String o2) -> int
```
W miejsce komparatora możemy więc wstawić wyrażenie lambda, które odpowiada sygnaturze takiej funkcji, np.:
```java
(String s1, String s2) -> s1.compareToIgnoreCase(s2)
```
a jeśli kompilator się domyśli to nawet:
```java
(s1, s2) -> s1.compareToIgnoreCase(s2)
```
Cały kod wygląda wtedy tak:
```java 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class ComparatorLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
        //sortowanie aldabetyczne z uwzględnieniem wielkości liter
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //metoda dorEach od Jav8 8 daje możliwości jak pętla for-each
        //oczekuje argumentu typu java.util.function.Consumer, czyli
        // (arg) -> void
        names.forEach(arg -> System.out.println(arg));
    }
}
```