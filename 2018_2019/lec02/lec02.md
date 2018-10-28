Programowanie obiektowe w Javie - lec02
=======================================

Podstawy programowania
======================

### Wczytywanie danych od użytkownika

Tworzymy obiekt klasy `Scanner`

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
Scanner input = new Scanner(System.in);
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Wykorzystujemy metodę `nextDouble()` aby wczytać liczbę typu double od
użytkownika

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
System.out.print("Enter a double value: ");
Scanner input = new Scanner(System.in);
double d = input.nextDouble();
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Przykład progamu obliczającego pole koła na podstawie promienia podanego przez
użytkownika:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
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
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Nazwy zmiennych

-   składają się z liter, liczb, znaków podkreślenia (_) oraz znaków dolara (\$)

-   nie mogą zaczynać się od liczby

-   nie mogą być [słowem
    kluczowym](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

-   nie mogą to być słowa `true`, `false` oraz `null`

-   mogą mieć dowolna długość

### Deklaracja zmiennych

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
int x;
double radius;
char a;
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Inicjalizacja zmiennych

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
x = 1;
radius = 1.0;
a = 'A';
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

>   **Uwaga:** Zmienna przechowuje dane typu zgodnego z jej typem (lub typu
>   zbliżonego - co to znaczy później).

### Deklaracja i inicjalizacja w jednym kroku

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
int x = 1;
double d = 1.4;
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

>   **Uwaga:** Nazwy zmiennych powinny coś znaczyć, tak aby struktura programu
>   była łatwa do interpretacji.

### Typy danych

| Nazwa   | Zakres                                                                 |
|---------|------------------------------------------------------------------------|
| byte    | od -27 do 27-1, czyli od -128 do 127                                   |
| short   | od -215 do 215-1, czyli od -32768 do 32767                             |
| int     | od -231 do 231-1, czyli od -2147483648 do 2147483647                   |
| long    | od -263 do 263-1, czyli od -9223372036854775808 do 9223372036854775807 |
| float   | około +/- 3.40282347E+38F                                              |
| double  | około +/- 1.79769313486231570E+308                                     |
| char    | od 0 do 65536                                                          |
| boolean | `true` lub `false`                                                     |

Więcej informacji
[tutaj](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).

| **Nazwa typu** | **Wartość domyślna** |
|----------------|----------------------|
| byte           | 0                    |
| short          | 0                    |
| int            | 0                    |
| long           | 0L                   |
| float          | 0.0f                 |
| double         | 0.0d                 |

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
// podkreślenie oddziela tysiące, ale może być umieszczony w dowolnym miejscu pomiędzy cyframi
long creditCardNumber = 1234_5678_9012_3456L; 
long socialSecurityNumber = 999_99_9999L;
float pi =  3.14_15F;
long hexBytes = 0xFF_EC_DE_5E;
long hexWords = 0xCAFE_BABE;
long maxLong = 0x7fff_ffff_ffff_ffffL;
byte nybbles = 0b0010_0101;
long bytes = 0b11010010_01101001_10010100_10010010;
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Wczytywanie liczb z klawiatury

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
Scanner input = new Scanner(System.in);
int value = input.nextInt();
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

możemy też użyć innych funkcji:

| Nazwa metody | Opis                          |
|--------------|-------------------------------|
| nextByte()   | wczytuje liczbę typu `byte`   |
| nextShort()  | wczytuje liczbę typu `short`  |
| nextInt()    | wczytuje liczbę typu `int`    |
| nextLong()   | wczytuje liczbę typu `long`   |
| nextFloat()  | wczytuje liczbę typu `float`  |
| nextDouble() | wczytuje liczbę typu `double` |

### Podstawowe operatory

| Operator | Nazwa                       | Przykład                                                    |
|----------|-----------------------------|-------------------------------------------------------------|
| \+       | Operator dodawania          | 2+2 =\> 4                                                   |
| \-       | Operator odejmowania        | 6-4 =\> 2                                                   |
| \*       | Operator mnożenia           | 3\*4 =\> 12                                                 |
| /        | Operator dzielenia          | 25/7 =\> 3, bo do w tym przypadku dzielimy liczby całkowite |
| %        | Operator reszty z dzielenia | 35 % 12 =\> 11, bo 35=2\*12+11                              |

**Uwaga:**

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
5 / 2   // zwróci wynik 2
5.0 / 2 // zwróci wynik 2.5
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

**Uwaga:**

Kod

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

wypisze:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
0.5000000000000001
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Przykład

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble(); 

    // Convert Fahrenheit to Celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " is " + 
      celsius + " in Celsius");  
  }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Na skróty

| Operator | Przykład          | Równoważne z...              |
|----------|-------------------|------------------------------|
| \+=      | i += 8            | i = i + 8                    |
| \-=      | i -= 8            | i = i - 8                    |
| \*=      | i \*= 8           | i = i \* 8                   |
| /=       | i /= 8            | i = i / 8                    |
| %=       | i %= 8            | i = i % 8                    |
| Operator | Nazwa             | Przykład (i = 1)             |
| \++var   | preinkrementacja  | int j = ++i; // j = 2, i = 2 |
| var++    | postinkrementacja | int j = i++; // j = 1, i = 2 |
| \--var   | predekrementacja  | int j = --i; // j = 0, i = 0 |
| var--    | postdekrementacja | int j = i--; // j = 1, i = 0 |

Relacje
-------

| Operator | Nazwa                  | Przykład (radius = 5) | Wynik |
|----------|------------------------|-----------------------|-------|
| \<       | mniejszy niż           | radius \< 0           | false |
| \<=      | mniejszy lub równy niż | radius \<= 0          | false |
| \>       | większy niż            | radius \> 0           | true  |
| \>=      | większy lub równy niż  | radius \>= 0          | true  |
| ==       | równy                  | radius == 0           | false |
| !=       | różny                  | radius != 0           | true  |

Instrukcja sterująca - `if`
---------------------------

>   jeśli (zachodzi warunek) to

>   ​ wykonaj blok instrukcji

w języku Java wyrażamy jako:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
if (zachodzi_warunek){
    // blok instrukcji - wykonywany jeśli zachodzi_warunek ma wartość logiczną true
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Przykład

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
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
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Konstrukcja `if-else`

>   jeśli (zachodzi warunek) to

>   ​ wykonaj blok instrukcji

>   w przeciwnym przypadku:

>   ​ wykonaj inny blok instrukcji

w języku Java wyrażamy jako:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
if (zachodzi_warunek){
    // blok instrukcji - wykonywany jeśli zachodzi_warunek ma wartość logiczną true
} else{
    // inny blok instrukcji - wykonywany jeśli zachodzi_warunek ma wartość logiczną false
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Przykład

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
import java.util.Scanner;

public class OddEvenTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Poadj liczbę całkowitą:");
        
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Kilka słów o `if`

Przykład zgnieżdzenia instrukcji `if`

```java
int x = 6;
if(x % 2 == 0){
  if(x % 3 == 0){
    System.out.println(x + " jest podzielne przez sześć");
  }
}
```

Oczywiście nie jest to optymalne, możemy wykorzystać operator `and` który w Javie ma postać `&&`

```java
int x = 72;

if(x % 2 == 0 && x % 3 == 0){
  System.out.println(x + " jest podzielne przez sześć");
}
```

Dla opratorów logicznych 

- and/i, który zapisujemy `&&`
- or/lub, który zapisujemy `||`
- not/przeczenie,  zapisujemy `!`

możemy przedstawić tzw. tablice prawdy

| Wyrażenie A | Wyrażenie B | A && B | A \|\| B |
| ----------- | ----------- | ------ | -------- |
| False       | False       | False  | False    |
| False       | True        | False  | True     |
| True        | False       | False  | True     |
| True        | True        | True   | True     |

ponadto:

| Wyrażenie A | `!A`  |
| ----------- | ----- |
| False       | True  |
| True        | False |

Wykorzystując nawiasy okrągłe możemy tworzyć bardziej złożone warunki:

```java
int x = 72;

if((x % 2 == 0 && x % 3 == 0) || (x % 5 == 0)){ // sprawdzamy czy x jest podzielne przez 6 lub 5
  System.out.println(x + " jest podzielne przez sześć lub przez pięć");
}
```

## Pętle

### Pętla `while`

Pętla `while` ma ogólną postać

> ## while(warunek){
> ## 	// blok instrukcji 
> ## }

Pętla wykonuje się - tzn. powtarzane są instrukcje zawarte między nawiasami wąsatymi - dopóki warunek zwraca wartość (ma wartość) logiczną `true`. Należy pamiętać, aby co iterację zmieniać stan programu w przeciwnym przypadku możemy uzyskać pętlę nieskończoną.

Przykład 1:

```java
public class P02 {
    public static void main(String[] args) {
          int licznik = 0;
          while (licznik < 5){
              System.out.println(licznik+ " Hello world!");
              ++licznik;
          }
    }
}
```

Przykład 2:

```java
public class P02 {
    public static void main(String[] args) {
        int n = 1;
        int count = 1;
        while (n < 100){
            if( n % 2 == 0 && n % 3 == 0){
                System.out.println(count + " " + n);
                ++count;
            }
            ++n;
        }
    }
}
```

### Pętla `for`

Pętla `for` ma ogólną postać

> ## for(inicjalizacja; warunek; akcje_po_iteracji){
> ## 	// blok instrukcji 
> ## }

Pętla `for` rozpoczyna się od wykoniania instrukcji zawartych w **inicjalizacji**, następnie sprawdzany jest **warunek** i jeśli jest on prawdziwy wykonywany jest blok instrukcji, na zakończenie iteracji wykonywane są instrukcje **akcje_po_iteracji**. Następnie znów jest sprawdzany warunek, itd.

Przykład:

```java
for(int j = 0; j < 3 ; ++j){
  System.out.println(j + " Hello world!");
}
```



Oczywiście możemy skomplikować postać pętli, np.

```java
for(int j = 0;  ; ){
  System.out.println(j + " Hello world!");
  ++j;

  if( !(j < 3) ){
    break;
  }
}
```

### break

Słowo kluczowe przerywa działanie pętli, sterowanie przekazywane jest na koniec pętli, np.

```java
for(int j = 0;  ; ){
  System.out.println(j + " Hello world!");
  ++j;

  if( !(j < 3) ){
    break;
  }
}
```

Przykład

```java
public class TestBreak {
  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      sum += number;
      if (sum >= 100) 
        break;
    }

    System.out.println("The number is " + number);
    System.out.println("The sum is " + sum);
  }
}
```



### continue

Słowo przerywa wykonywanie interukcji w danej iteracji pętli i przechodzi do następnej iteracji.

Przykład:

```java
public class TestContinue {
  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      if (number == 10 || number == 11) 
        continue;
      sum += number;
    }

    System.out.println("The sum is " + sum);
  }
}
```

