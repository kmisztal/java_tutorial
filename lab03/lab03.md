### Zadanie 1

Uruchom poniższy kod. Zmodyfikuj kod tak aby wypisywał czy liczba jest parzysta czy nie parzysta wykorzystując do tego celu operator modulo.

```java
import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 5 == 0)
      System.out.println("HiFive");

    if (number % 2 == 0)
      System.out.println("HiEven");
  }
}
```

### Zadanie 2

Uruchom poniższy kod. Zmodyfikuj kod tak aby wypisywał czy liczba jest podzielna przez 3 - zakładamy, żę pracujemy na liczbach z przedziału od 0 do 999.

```java
import java.util.Scanner; 

public class TestBooleanOperators {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 2 == 0 && number % 3 == 0)
      System.out.println(number + " is divisible by 2 and 3.");

    if (number % 2 == 0 || number % 3 == 0)
      System.out.println(number + " is divisible by 2 or 3.");

    if (number % 2 == 0 ^ number % 3 == 0)
      System.out.println(number + 
        " divisible by 2 or 3, but not both.");
  }
}
```

### Zadanie 3

Uruchom poniższy kod.

```java
import java.util.Scanner; 

public class LeapYear {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check if the year is a leap year 
    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);   
  } 
}
```

### Zadanie 4

Przygotuj program, który zasymuluje odliczanie do startu rakiety.

### Zadanie 5

Przygotuj program, który wypisze silnię dla zadanej liczby. Jaki typ danych wykorzystasz? Liczbę pobierz od użytkownika. Sprawdzaj czy nie przekroczyłeś zakresu.

### Zadanie 6

Przygotuj program, który wypisze n-tą liczbę z ciągu Fibonacciego. n pobierz od użytkownika.