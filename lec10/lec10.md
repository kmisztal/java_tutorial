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