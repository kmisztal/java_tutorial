
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

### I jeszcze raz
Wyrażenia lambda są w pewien sposób podobne do anonimowych klas, ponieważ można je określić jako anonimowe metody. Z tego wynika, że będą odpowiadały pojedynczym metodom, które można na przykład przekazać jako argument do innej metody. Rzeczywiście, wyrażenie lambda implementuje metodę zdefiniowaną w interfejsie funkcjonalnym. Czym zatem jest interfejs funkcjonalny? Jest to taki interfejs, który posiada tylko jedną metodę abstrakcyjną (niezaimplementowaną), może natomiast posiadać wiele metod domyślnych.

Przy tworzeniu takich interfejsów dobrze jest wyraźnie zaznaczyć, że są one funkcjonalne używając adnotacji `@FunctionalInterface`.

Generalnie struktura wyrażenia lambda wygląda tak:

```
(parametr1, parametr2,...) -> {
	ciało lambdy
}
```

Przy czym możliwe są różne modyfikacje tego wzorca. Na przykład może nie być wcale parametrów:

```
() -> {
ciało lambdy
}
```

Jeśli ciało lambdy zawiera tylko jedną linię kodu, nawiasy klamrowe są zbędne:

```
(parametr1) -> polecenie;
```

Jeśli jest tylko jeden parametr, można ominąć nawiasy:

```
parametr -> polecenie;
```

Przykład:
```java
@FunctionalInterface
public interface Thinkable {
    void think(String sentence);
}
```

# Wyrażenia lambda
Zacznijmy od początku. Często w Javie spotyka się takie konstrukcje:
```java
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent event) {
		System.out.println("button clicked");
	}
});
```
czyli wykorzystujemy anonimowe klasy wewnętrzne.

Tak jak wspominałem ostatnio wykorzystując wyrażania lambda możemy to samo osiągnąć w jednej linii

```java
button.addActionListener(event -> System.out.println("button clicked"));
```

## Kilka przykładów:

```java
//1
Runnable noArguments = () -> System.out.println("Hello World");

//2
ActionListener oneArgument = event -> System.out.println("button clicked");

//3
Runnable multiStatement = () -> {
	System.out.print("Hello");
	System.out.println(" World");
};

//4
BinaryOperator<Long> add = (x, y) -> x + y;

//5
BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
```

1. pokazuje jak wykorzystać lambdę w definiowaniu wyrażenia nie przyjmującego argumentu
2. jeśli mamy jeden argument to możemy opuścić nawiasy wokół niego
3. w przypadku wielolinijkowych wyrażeń zapisujemy je w bloku używając nawiasów klamrowych
4. wyrażania lambda mogą przyjmować więcej argumentów, dla przykładu w definiujemy funkcję która dodaje dwie liczby tupu `Long`
5. w poprzednich przykładach typów danych domyślał się kompilator, ale jeśli chcemy sami możemy wskazać o jakie dane nam chodzi

## Używanie zmiennych

Klasy anonomowe wymagają użycia zmiennej typu `final`
```java
final String name = getUserName();
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent event) {
		System.out.println("hi " + name);
	}
});
```
lub zmiennej która jest effectively final tzn. wartość została do niej przypisana tylko raz (nowość w Java 8)

```java
String name = getUserName();
button.addActionListener(event -> System.out.println("hi " + name));
```
zmienne `name` jest właśnie taką zmienną.

Poniży kod wywoła błąd kompilatora:
```java
String name = getUserName();
name = formatUserName(name);
button.addActionListener(event -> System.out.println("hi " + name));
```

## Interfejsy funkcyjne

Jakiego typu są wyrażania lambda? W przypadku funkcji dokładnie wiemy jakiego typu są (muszą być argumenty) a z lambdami?

WYrażanie lambda to interfejsy funkcyjne, np.
```java
public interface ActionListener extends EventListener {
	public void actionPerformed(ActionEvent event);
}
```

Najpopularniejsze przykłady:

|   Nazwa          |  Argument  |  Zwraca   | Przykład |
 |------------------|------| -----------| -----------------------------------|
| `Predicate<T> `  |  `T` | `boolean`  | Has this album been released yet?  |
|Consumer<T>| T| void| Printing out a value|
| Function<T,R> |T| R| Get the name from an Artist object|
| Supplier<T> |None |T| A factory method|
| UnaryOperator<T> |T| T |Logical not (!)|
| BinaryOperator<T> |(T, T)| T |Multiplying two numbers (*)|


### `Predicate`

Jest to interfejs który zwraca wartość logiczną
```java
Predicate<Integer> atLeast5 = x -> x > 5;
```
Powyższa funkcja testuje czy  dana liczba jest większa od 5.
```java
public interface Predicate<T> {
	boolean test(T t);
}
```

### `BinaryOperator`
Interfejs ten przyjmuje dwie wartości tego samego typu i zwraca wynik tego samego typu, 
```java
BinaryOperator<Long> addLongs = (x, y) -> x + y;
```
ale czasem może się nie dopyśleć o jaki typ chodzi, np.

```java
BinaryOperator add = (x, y) -> x + y;
```
Spowoduje błąd kompilatora.


# Strumienie (streams)

## Od external iteration do internel iteration

Czy da się coś takiego zrobić prościej?
```java
int count = 0;
for (Artist artist : allArtists) {
	if (artist.isFrom("London")) {
		count++;
	}
}
```
problemy:
- długie
- problem ze zrównolegleniem
- problem z utrzymaniem kodu
- trzeba przegryźć się przez całość aby zrozumieć o co chodziło programiście

Zatem zróbmy to iteratorem
```java
int count = 0;
Iterator<Artist> iterator = allArtists.iterator();
while(iterator.hasNext()) {
	Artist artist = iterator.next();
	if (artist.isFrom("London")) {
		count++;
	}
}
```
jest to przykład tzn. zewnętrznej iteracji

![external](https://github.com/kmisztal/java_tutorial/blob/master/lec04/images/ext.png)


