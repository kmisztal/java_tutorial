Programowanie obiektowe w Javie - lec01
=======================================

Wprowadzenie
============

### Programy komputerowe

**Programy komputerowe**, czyli software, to instrukcje wykonywane w komputerze.
Programy komputerowe napisane są wykorzystując języki programowania.

### Język maszynowy (machine language)

**Język maszynowy** to zbiór prymitywnych instrukcji wbudowanych w każdym
komputerze. Instrukcje zapisane są w postaci binarnego kodu, więc trzeba
wprowadzić kody binarne dla różnych instrukcji. Program z natywnym językiem
maszynowym jest procesem. Programy na tym poziomie są bardzo trudne do
odczytania i modyfikowania. Na przykład, aby dodać dwie liczby, możesz napisać
instrukcję w binarny sposób:

`1101101010011010`

### Assemblery (assembly language)

**Języki asemblera** (zwyczajowo asemblery) to rodzina języków programowania
niskiego poziomu, których jedno polecenie odpowiada zasadniczo jednemu rozkazowi
procesora. Asemblery zostały opracowane aby przygotowanie nowych programów
komputerowych było prostsze - kod w assemblerze jest konwertowany do instrukcji
języka maszynowego. Dla przykładu, aby dodać dwie liczy można użyć instrukcji:

`ADDF3 R1, R2, R3`

### Języki wysokiego poziomu (high-Level language)

Język wysokiego poziomu, jak np. język angielsko-podobny jest łatwy w nauczeniu,
dlatego opracowano języki, które wykorzystując składnię zbliżoną do języka
angielskiego pozwalają na pisanie programów. Dla przykładu, aby obliczyć pole
koła o promieniu 5 należy wykonać instrukcję:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
area = 5 * 5 * 3.1415;
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

### Interpreteacja/kompilacja kodu źródłowego (interpreting/compiling source code)

Programy napisany w języku wysokiego poziomu nazywany programem źródłowym lub
kodem źródłowym. Komputer nie może zrozumieć kodu źródłowego i musi on zostać
przetłumaczony na kod maszynowy, aby mógł byc uruchomiony. Takie tłumaczenie
może zostać wykonane przez narzędzie programistyczne zwane interpreterem
(interpreter) lub kompilatorem (compiler).

##### Interpretacja kodu źródłowego (interpreting source code)

Interperter czyta instrukcje kodu źródłowego i tłumaczy je na kod maszynowy albo
wirtualny kod maszynowy, a następnie taki kod jest wykonywany.

##### Kompilacja kodu źródłowego (compiling source code)

Kompilator tłumaczy cały kod źródłowy na kod maszynowy i taki kod maszynowy moze
zostać uruchomiony.

Dlaczego Java?
--------------

Java umożliwia deweloperom przygotowanie aplikacji uruchamiany na serwerach,
komputerach osobistych a nawet urządzeniach mobilnych. Ponadto:

-   **Java jest prosta** - Java jest wzorowana na jezyku C++, ale została
    znacząco uproszczona i poprawiona. Niekiedy wskzauje się, że Java to język
    "C++--", czyli C++, ale z większymi możliwościami oraz zredukowanymi
    negatywnymi aspektami.

-   **Java jest zorientowana obiektowo** - Java jest językiem zorientowanym
    obiektowo, co to oznacza dowiecie się Państwo trochę później, teraz należy
    rozumieć to w ten sposób, że jest jezykiem który umożliwia lepsze
    odwzorowanie otaczającego świata w postaci programu komputerowego oraz jest
    to język w którym pracujemy z obiektami.

-   **Java jest językiem wsprierającym obliczenia rozproszone** - obliczenia
    rozproszone wyonywane są na kilku komputerach pracujących razem w sieci.
    Java została zprojektowana tak, aby uczynić takie obliczenia łatwymi do
    skonfigurowania.

-   **Java jest językiem interpretowalnym** - konieczne jest posiadanie
    interpretera do uruchomienia programów napisaych w JavieYou need an
    interpreter to run Java programs. The programs are compiled into the Java
    Virtual Machine code called bytecode. The bytecode is machine-independent
    and can run on any machine that has a Java interpreter, which is part of the
    Java Virtual Machine (JVM).

-   **Java jest językiem bezpiecznym** - Java implementuje mechanizmy
    bezpieczeństwa zabezpieczające system przed nieporządane programy.

-   **Java językiem niezależnym od architektury** - **Write once, run
    anywhere**, to stwierdzenie przyświecało twórcom języka. Dzięki
    wykorzystaniu wirtualnej maszyny Javy (Java Virtual Machine (JVM)), dlatego
    możemy napisać program raz i uruchomić na dowolnej platformie.

-   **Java językiem przenośnym** - Ponieważ Java jest niezleżna od
    archiotektury, dlatego możesz uruchomić aplikację w Javie bez konieczności
    rekompilacji przy zmienie platformy.

-   **Java jest językiem wpierającym programowanie wielowątkowe** -
    Programowanie wielowątkowe jest w łatwy sposób dostepne w Javie.

Pierwszy program
================

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
// This program prints Welcome to Java! 
public class HelloWorld {   
  public static void main(String[] args) { 
    System.out.println("Hello world!");
  }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Program dostępny także pod [tym
adresem](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/HelloWorld.java).

### Kompilacja

Program należy zapisać pod nazwą `HelloWorld.java`.

Aby **skompilować program** należy wydać polecenie:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ bash
javac HelloWorld.java
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

W efekcie zostanie utworzony plik `HelloWorld.class` - zawierający bytecode Javy
- więcej o tym w przyszłości. To ten kod jest interpretowany przez wirtualną
maszynę Javy.

Aby **uruchomić program** należy wydać polecenie:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ bash
java HelloWorld
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Przykłady
---------

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public class WelcomeWithThreeMessages { 
    public static void main(String[] args) { 
        System.out.println("Programming is fun!");
        System.out.println("Fundamentals First");
        System.out.println("Problem Driven");
    }  
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Program dostępny także pod [tym
adresem](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/WelcomeWithThreeMessages.java)

#### Kolejne przykłady:

-   [\`ComputeExpression](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ComputeExpression.java)\`
    - program, który wyliczy wartość przykładowego wyrażenia.

Anatomia Javy
=============

#### Nazwa klasy

Każdy program w Javie musi mieć co najmniej jedną klasę. Klasa ma nazwę. Według
konwencji nazewniczej nazwy klas zaczynają się z wielkiej litery - w naszym
przypadku jest to `HelloWorld`

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public class HelloWorld{
  //---
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Metoda `main`

Klasę można uruchomić, jeśli zawiera metodę `main` - jej sygnatura znajduje się
poniżej. Uruchomienie programu polega na uruchomieniu metody `main`:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public static void main(String [] args){
  //---
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Instrukcja

Instrukcja to reprezentacja działania lub sekwencji działań. Przykład
pojedynczego działania polegajacego na wyświetleniu tekstu "Hello world"
znajduje się poniżej:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
System.out.println("Hello world!");
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#### Zakończnie instrukcji - średnik - ;

Każda instrukcja w Javie kończy się średnikiem (;).

#### Słowa kluczowe języka (reserved words)

Słowa kluczowe języka (reserved words or keywords) to słowa o specyficznym
znaczeniu w języku. Kompilator widząc je interpretuje je w specyficzny sposób -
dlatego nie mogą być one używane w dowolny sposób przez programistę. Np.:
kompilator widzą słowo `class` spodziewa się, że następujące po nim słowo to
nazwa klasy.

Znane nam słowa kluczowe, zawarte w naszym przykładzie to: - `public`  - `class
` - `static`  - `void`

#### Bloki instrukcji - nawiasy klamrowe -

Para nawiasów klamrowych tworzy tzw. blok instrukcji - wykorzytujemy je aby
nadać strukturę instrukcjom występującym w programie.

#### Symbole specjalne

| Symbol | Znaczenie                    |
|--------|------------------------------|
| {}     | Oznacza blok instrukcji      |
| ()     | Używane z metodami           |
| []     | Oznacza tablicę              |
| //     | Komentarz jednolinijkowy     |
| " "    | Obejmuje ciąg znaków - tekst |
| ;      | Orznacza koniec instrukcji   |

Błędy
-----

-   [Błąd
    składniowy](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowSyntaxErrors.java)
    (Syntax Errors) - powstały w wyniku błędnego użycia składni języka.

-   [Błąd czasu
    wykonania](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowRuntimeErrors.java)
    (Runtime Errors) - błąd pojawiający się w trakcie działania programu w
    przypadku zaistniena sytuacji wyjątkowej.

-   [Błąd
    logiczny](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowLogicErrors.java)
    (Logic Erors) - błąd powstały w wyniku błędnej konstrukcji logicznej
    zawartej w programie.

Podstawowe operatory
--------------------

| Operator | Nazwa                       | Przykład                                                    |
|----------|-----------------------------|-------------------------------------------------------------|
| \+       | Operator dodawania          | 2+2 =\> 4                                                   |
| \-       | Operator odejmowania        | 6-4 =\> 2                                                   |
| \*       | Operator mnożenia           | 3\*4 =\> 12                                                 |
| /        | Operator dzielenia          | 25/7 =\> 3, bo do w tym przypadku dzielimy liczby całkowite |
| %        | Operator reszty z dzielenia | 35 % 12 =\> 11, bo 35=2\*12+11                              |

[Przykład](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/Operators.java)
na podstawowe operatory.

Operatory \* / % mają wyższy priorytet niż oparetory + -.

W przypadku, gdy w wyrażaniu występują operatory o tym samym priorytecie
wykonywane są w kolejności od lewej do prawej.

[Przykład](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/OperatorsPriority.java)
na priorytet operatorów.

Więcej o operatorach można znaleźć na [tej
stronie](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).

Proste programowanie - defininiowanie zmiennych
-----------------------------------------------

Pozwalają one na przechowywanie danych różnego typu. Wyróżniamy dwie fazy
tworzenia zmiennej: - **Deklaracja** - tutaj określamy typ i nazwę zmiennej -
**Inicjalizacja** - nadanie wartości zmiennej

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public class Variable {
    public static void main(String[] args) {

        int liczba; // Deklaracja

        liczba = 5; // Inicjalizacja
    }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Zaczynając od początku tworzymy klasę Zmienne (pamiętaj, aby zapisać plik jako
*\`Variable.java*\`), a w niej tworzymy metodę *main()*. Dalej następuje
zadeklarowanie zmiennej typu int i nazwie *liczba* (**deklaracja**), a w
kolejnej linii nadajemy jej wartość 5 (**inicjalizacja**). Oczywiście możemy
dokonać dwie powyższe instrukcje w jednej linii:

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public class Variable2{
    public static void main(String[] args){
        char znak = 'A';
    }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Schemat tworzenia zmiennych jest prosty

>   nazwa_typu nazwa_zmiennej = wartość;

| Przykład            | Wyjaśnienie                                                                              |
|---------------------|------------------------------------------------------------------------------------------|
| `int x;`            | Deklaracja zmiennej o nazwie `x` przechowującej wartości całkowite                       |
| `int y = 5;`        | Deklaracja i inicjalizacja zmiennej `y` przechowującej wartości całkowite o wartości `5` |
| `double t;`         | //..                                                                                     |
| `double t = 4;`     | //..                                                                                     |
| `double pi = 3.14;` | //..                                                                                     |

Bardziej zaawansowany przykład

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ java
public class ComputeArea {
    public static void main(String[] args) {
        double radius; // deklaracja zmiennej 
        double area; // deklaracja zmiennej

        // przypisanie wartości promienia
        radius = 20; // nowa wartość promienia

        // wyznaczenie wartości pola koła
        area = radius * radius * 3.14159;

        // wyświetlenie wartości pola koła
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


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
