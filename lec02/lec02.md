### Programowanie obiektowe w Javie - lec02





# Podstawy programowania

### Wczytywanie danych od użytkownika

Tworzymy obiekt klasy `Scanner` 

```java
Scanner input = new Scanner(System.in);
```

Wykorzystujemy metodę `nextDouble()` aby wczytać liczbę typu double od użytkownika

```java
System.out.print("Enter a double value: ");
Scanner input = new Scanner(System.in);
double d = input.nextDouble();
```

Przykład progamu obliczającego pole koła na podstawie promienia podanego przez użytkownika:

```java
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display result
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
```

### Nazwy zmiennych

- składają się z liter, liczb, znaków podkreślenia (_) oraz znaków dolara ($)
- nie mogą zaczynać się od liczby
- nie mogą być [słowem kluczowym](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html) 
- nie mogą to być słowa `true`, `false` oraz `null`
- mogą mieć dowolna długość

### Deklaracja zmiennych

```java
int x;
double radius;
char a;
```

### Inicjalizacja zmiennych 

```java
x = 1;
radius = 1.0;
a = 'A';
```

> **Uwaga:** Zmienna przechowuje dane typu zgodnego z jej typem (lub typu zbliżonego - co to znaczy później).

###Deklaracja i inicjalizacja w jednym kroku

```java
int x = 1;
double d = 1.4;
```

> **Uwaga:**  Nazwy zmiennych powinny coś znaczyć, tak aby struktura programu była łątwa do interpretacji.

### Typy danych

| Nazwa | Zakres                                   |
| ----- | ---------------------------------------- |
| byte  | od -2<sup>7</sup> do 2 <sub>7</sub>-1, czyli od -128 do 127 |
|       |                                          |
|       |                                          |
|       |                                          |
|       |                                          |

