## `Optional`

Rozważmy klasę

```java
public class Product {

    private long productID;
    private String productName;

    public Product() {
    }

    public Product(long productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                '}';
    }
}
```

Korzystając z powyższej klasy możemy wygenerować następujący kod

```java
public class Runner {
    public static void main(String[] args) {
        Product cup = new Product();
        if (cup.getProductName().equals("Cup")){
            System.out.println("Cup!");
        }
    }
}
```
jednak przy jego uruchomieniu dostaniemy `NullPointerException`, ponieważ powinniśmy zrobić to tak

```java
        if (cup.getProductName() != null) {
            if (cup.getProductName().equals("Cup")) {
                System.out.println("Cup!");
            }
        }
```

ale czy naprawdę jesteśmy na to skazani???

A co gdy nasze wywołania będą bardziej skomplikowane?, np.:
```java
zoo.getAnimals().getCats().getCat().getName()
```
wtedy mamy napisać coś takiego?
```java
		if (zoo != null){
            Animals animals = zoo.getAnimals();
            if (animals != null){
                Cats cats = animals.getCats();
                if (cats != null){
                    Cat cat = cats.getCat();
                    if (cat != null){
                        if (cat.getName() != null){
                            System.out.println(cat.getName());
                        }
                    }
                }
            }
        }
```
ile niepotrzebnego pisania!!!

Wykorzystując klasę `Optional` zrobimy to tak:
```java
System.out.println(Optional.ofNullable(cup.getProductName()).orElse("Empty product name"));
// better
Optional.ofNullable(cup.getProductName()).ifPresent(System.out::println);
```
Klasa `Optional` ma kilka [metod](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html). 
Metoda `ofNullable` tworzy nam Optionala zawierającego wartość jeśli istnieje, w przeciwnym wypadku ustawimy wartość “Empty product name” (metoda `orElse`).
Mamy także przykład z wykorzystaniem metody `ifPresent`, która jest wywoływana wtedy, gdy Optional nie jest nullem.

Gettery naszej klasy mogą teraz wyglądać tak:
```java
	public Optional getProductID() {
        return Optional.ofNullable(productID);
    }

    public Optional getProductName() {
        return Optional.ofNullable(productName);
    }
```
a ich wywołania mogą zostać zmienione
```java
		if (cup.getProductName() != null) {
            if (cup.getProductName().equals("Cup")) {
                System.out.println("Cup!");
            }
        }
        //Can change to:
        System.out.println(cup.getProductName().orElse("Empty product name"));
```		
Więcej do poczytania [tutaj](http://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html)

### Przykłady

```java
List<Optional<String>> stringsMaybe = Arrays.asList(Optional.of("Hi"),
                                      Optional.empty(), Optional.of(" there!"));

List<String> strings = stringsMaybe
            .stream()
            .filter(Optional::isPresent)
            .collect(toList());
			
```			

```java
import java.util.Optional;

public class Person {

    private String name;
    private String lastName;
    private Integer age;


//    public String getName() {
//        return name;
//    }
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getLastName() {
//        return lastName;
//    }
    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Integer getAge() {
//        return age;
//    }
    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + Optional.ofNullable(name).orElse("") + '\'' +
                ", lastName='" + Optional.ofNullable(lastName).orElse("") + '\'' +
                ", age=" + Optional.ofNullable(age).orElse(0) +
                '}';
    }

    public static void main(String[] args) {
        // 1
        Person person = new Person();
        person.setName("John");

        Optional.ofNullable(person.getName()).ifPresent(System.out::println);

        // 2
        System.out.println(Optional.ofNullable(person.getName()).map(value -> "imie: "+value).orElse("brak Imienia!"));
        System.out.println(Optional.ofNullable(person.getLastName()).map(value -> "nazwisko: " +value).orElse("brak nazwiska !"));

        // 3
        person.getName().ifPresent(System.out::println);
        System.out.println(person.getLastName().map(value -> "nazwisko: " + value).orElse("brak nazwiska !"));
        person.setAge(22);
        System.out.println(person.getAge()
                .filter(age -> age >= 18)
                .map(age -> "wiek: " + age + ". Osoba pełnoletnia")
                .orElse("Osoba niepełnoletnia"));
    }
}
```

`Optional` zawiera metodę `filter`
```java
// if the value is not present
Optional carOptionalEmpty = Optional.empty();
carOptionalEmpty.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );

// if the value does not pass the filter
Optional carOptionalExpensive = Optional.of( new Car( "3333" ) );
carOptionalExpensive.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );

// if the value is present and does pass the filter
Optional carOptionalOk = Optional.of( new Car( "250" ) );
carOptionalOk.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );
```
oraz metodę `map`
```java
// non empty string map to its length -> we get the lenght as output (18)
Optional stringOptional = Optional.of( "loooooooong string" );
Optional sizeOptional = stringOptional.map( String::length ); //map from Optional to Optional
System.out.println( "size of string " + sizeOptional.orElse( 0 ) );

// empty string map to its length -> we get 0 as lenght
Optional stringOptionalNull = Optional.ofNullable( null );
Optional sizeOptionalNull = stringOptionalNull.map( x -> x.length()  ); // we can use Lambdas as we want
System.out.println( "size of string " + sizeOptionalNull.orElse( 0 ) );
```
Można też
```java
Person p = getPerson(); 
Address home = p.getAddress().orElse(Address.EMPTY);

Address home = p.getAddress.orElseThrow(NoAddressException::new);
```

Zatem możemy zawsze być bezpieczni
```java
String unit = person.getAddress().getCity().getStreet().getUnit();
```
```java
String unit= person.flatMap(Person::getAddress)
                   .flatMap(Address::getCity)
                   .flatmap(City::getStreet)
                   .map(Street::getUnit)
                   .orElse("UNKNOWN");
```
`Optional` jest często wykorzystywany, np. w poniższym kodzie zostanie rzucony wyjątek, bo lista jest pusta
```java
IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max().getAsInt();
```
chyba, że 
```java
import java.util.OptionalInt;
import java.util.stream.IntStream;
//from  w w  w  .j a  v a  2 s. co m
public class Main {
  public static void main(String[] args) {

    OptionalInt maxOdd = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
    if (maxOdd.isPresent()) {
      int value = maxOdd.getAsInt();
      System.out.println("Maximum odd  integer is " + value);
    } else {
      System.out.println("Stream is  empty.");
    }
  }
}
```

## `Consumer` vs. `Supplier`

### `Supplier`
```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```
Jedyną metodą w tym interfejsie jest `get()`. `Supplier` możemy wykorzystać jako “dostawce”, przykład:
```java
import java.util.function.*;

public class Program {

    static void display(Supplier<Integer> arg) {
        System.out.println(arg.get());
    }

    public static void main(String[] args) {

        // Pass lambdas to the display method.
        // ... These conform to the Supplier class.
        // ... Each returns an Integer.
        display(() -> 10);
        display(() -> 100);
        display(() -> (int) (Math.random() * 100));
    }
}
```

### `Consumer`

```java
@FunctionalInterface
public interface Consumer<T> {
     void accept(T t);
     ...
}
```
Według definicji najważniejszą metodą jest metoda `accept()`, która przyjmuje dowolny typ, natomiast nic nie zwraca. Nasz interfejs `Consumer` wywołujemy poprzez:

```java
import java.util.function.*;

public class Program {

    static void display(int value) {

        switch (value) {
        case 1:
            System.out.println("There is 1 value");
            return;
        default:
            System.out.println("There are " + Integer.toString(value) + " values");
            return;
        }
    }

    public static void main(String[] args) {

        // This consumer calls a void method with the value.
        Consumer<Integer> consumer = x -> display(x - 1);

        // Use the consumer with three numbers.
        consumer.accept(1);
        consumer.accept(2);
        consumer.accept(3);
    }
}
```