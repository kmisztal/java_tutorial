# Programowanie obiektowe w Javie - lec01





# Wprowadzenie

### Programy komputerowe

**Programy komputerowe**, czyli software, to instrukcje wykonywane w komputerze. Programy komputerowe napisane są wykorzystując języki programowania.

### Język maszynowy (machine language)

**Język maszynowy** to zbiór prymitywnych instukcji wbudowanych w każdym komputerze. Instrukcje zapisane są w postaci binarnego kodu, więc trzeba wprowadzić kody binarne dla różnych instrukcji. Program z natywnym językiem maszynowym jest procesem. Programy na tym poziomie są bardzo trudne do odczytania i modyfikowania. Na przykład, aby dodać dwie liczby, możesz napisać instrukcję w binarny sposób:

``` 1101101010011010 ```

### Assemblery (assembly language)

**Języki asemblera** (zwyczajowo asemblery) to rodzina języków programowania niskiego poziomu, których jedno polecenie odpowiada zasadniczo jednemu rozkazowi procesora. Asemblery zostały opracowane aby przygotowanie nowych programów komputerowych było prostsze - kod w assemblerze jest konwertowany do instrukcji języka maszynowego. Dla przykładu, aby dodać dwie liczy można użyć instrukcji:

``` ADDF3 R1, R2, R3 ```

### Języki wysokiego poziomu (high-Level language)

Język wysokiego poziomu, jak np. język angielsko-podoby jest łątwy w nauczeniu, dlatego opracowano języki kótre wykorzystując składnię zbliżoną do języka angielskiego pozwalają na pisanie programów. Dla przykąldu, aby obliczyć pole koła o promieniu 5 nalezy wykonać instrukcję:

```java
area = 5 * 5 * 3.1415;
```

### Interpreteacja/kompilacja kodu źródłowego (interpreting/compiling source code)

Programy napisany w języku wysokiego poziomu nazywany programem źródłowym lub kodem źródłowym. Komputer nie może zrozumieć kodu źródłowego i musi on zostać przetłumaczony na kod maszynowy, aby mógł byc uruchomiony. Takie tłumaczenie może zostać wykonane przez narzędzie programistyczne zwane interpreterem (interpreter) lub kompilatorem (compiler).

##### Interpretacja kodu źródłowego (interpreting source code)

Interperter czyta instrukcje kodu źródłowego i tłumaczy je na kod maszynowy albo wirtualny kod maszynowy, a następnie taki kod jest wykonywany.


##### Kompilacja kodu źródłowego (compiling source code)

Kompilator tłumaczy cały kod źródłowy na kod maszynowy i taki kod maszynowy moze zostać uruchomiony. 


## Dlaczego Java?

Java umożliwia deweloperom przygotownanie aplikacji uruchamiany na serwerach, komputerach osobistych a nawet urządzeniach mobilnych. Ponadto:

- **Java jest prosta** - Java jest wzorowana na jezyku C++, ale została znacząco uproszczona i poprawiona. Niekiedy wskzauje się, że Java to język "C++--", czyli C++, ale z większymi możliwościami oraz zredukowanymi negatywnymi aspektami.
- **Java jest zorientowana obiektowo** - Java jest językiem zorientowanym obiektowo, co to oznacza dowiecie się Państwo trochę później, teraz należy rozumieć to w ten sposób, że jest jezykiem który umożliwia lepsze odwzorowanie otaczającego świata w postaci programu komputerowego oraz jest to język w którym pracujemy z obiektami.
- **Java jest językiem wsprierającym obliczenia rozproszone**  - obliczenia rozproszone wyonywane są na kilku komputerach pracujących razem w sieci. Java została zprojektowana tak, aby uczynić takie obliczenia łatwymi do skonfigurowania.
- **Java jest językiem interpretowalnym** - konieczne jest posiadanie interpretera do uruchomienia programów napisaych w JavieYou need an interpreter to run Java programs. The programs are compiled into the Java Virtual Machine code called bytecode. The bytecode is machine-independent and can run on any machine that has a Java interpreter, which is part of the Java Virtual Machine (JVM). 
- **Java jest językiem bezpiecznym** - Java implementuje mechanizmy bezpieczeństwa zabezpieczające system przed nieporządane programy. 
- **Java językiem niezależnym od architektury** - **Write once, run anywhere**, to stwierdzenie przyświecało twórcom języka. Dzięki wykorzystaniu wirtualnej maszyny Javy (Java Virtual Machine (JVM)), dlatego możemy napisać program raz i uruchomić na dowolnej platformie.
- **Java językiem przenośnym** - Ponieważ Java jest niezleżna od archiotektury, dlatego możesz uruchomić aplikację w Javie bez konieczności rekompilacji przy zmienie platformy. 
- **Java jest językiem wpierającym programowanie wielowątkowe** - Programowanie wielowątkowe jest w łatwy sposób dostepne w Javie.

# Pierwszy program

```java
// This program prints Welcome to Java! 
public class HelloWorld {	
  public static void main(String[] args) { 
    System.out.println("Hello world!");
  }
}
```
Program dostępny także pod [tym adresem](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/HelloWorld.java).

### Kompilacja

Program nalezy zapisać pod nazwą "HelloWorld.java". 

Aby **skompilować program** należy wydać polecenie:

```bash
javac HelloWorld.java
```

W efekcie zostanie utworzony plik "HelloWorld.class" - zawierający bytecode Javy - więcej o tym w przyszłości. To ten kod jest interpretowany przez wirtualną maszynę Javy.

Aby **uruchomić program** należy wydać polecenie:

```bash
java HelloWorld
```

## Przykłady
```java
public class WelcomeWithThreeMessages { 
    public static void main(String[] args) { 
        System.out.println("Programming is fun!");
        System.out.println("Fundamentals First");
        System.out.println("Problem Driven");
    }  
}
```
Program dostępny także pod [tym adresem](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/WelcomeWithThreeMessages.java)

#### Kolejne przykłady:

- [ComputeExpression](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ComputeExpression.java) - program, który wyliczy wartość przykłądowego wyrażenia.

# Anatomia Javy

#### Nazwa klasy
Każdy program w Javie musi mieć co najmniej jedją klasę. Klasa ma nazwę. Według konwencji nazewniczej nazwy klas zaczynają się z wielkiej litery - w naszym przypadku jest to `HelloWorld` 

```java
public class HelloWorld{
  //---
}
```

#### Metoda `main`
Klasę można uruchomić, jeśli zawiera metodę `main` - jej sygnatura znajduje się poniżej. Uruchomienie programu polega na uruchomieniu metody `main`:  

```java
public static void main(String [] args){
  //---
}
```

#### Instrukcja
Instrukcja to reprezentacja działania lub sekwencji działań. Przykład pojedynczego działania polegajacego na wyświetleniu tekstu "Hello world" znajduje się poniżej:

```java
System.out.println("Hello world!");
```

#### Zakończnie instrukcji - średnik - ;
Każda instrukcja w Javie kończy się średnikiem (;).

#### Słowa kluczowe języka (reserved words)
Słowa kluczowe języka (reserved words or keywords) to słowa o specyficznym znaczeniu w języku. Kompilator widząc je interpretuje je w specyficzny sposób - dlatego nie mogą byc one uzywane w dowolny sposób przez programistę. Np.: kompilator widzą csłowo `class` spodziewa się, że następujące po nim słowo to nazwa klasy. 

Znane nam słowa kluczowe, zawarte w naszym przykładzie to:
- public 
- class
- static 
- void

#### Bloki instrukcji - nawiasy klamrowe - {}
Para nawiasów klamrowych tworzy tzw. blok instrukcji - wykorzytujemy je aby nadać strukturę instrukcjom występującym w programie. 

#### Symbole specjalne

| Symbol | Znaczenie                    |
| ------ | ---------------------------- |
| {}     | Oznacza blok instrukcji      |
| ()     | Używane z metodami           |
| []     | Oznacza tablicę              |
| //     | Komentarz jednolinijkowy     |
| " "    | Obejmuje ciąg znaków - tekst |
| ;      | Orznacza koniec instrukcji   |

## Błędy 

- [Błąd składniowy](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowSyntaxErrors.java) (Syntax Errors) - powstały w wyniku błędnego użycia składni języka.
- [Błąd czasu wykonania](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowRuntimeErrors.java) (Runtime Errors) - błąd pojawiający się w trakcie działania programu w przypadku zaistniena sytuacji wyjątkowej.
- [Błąd logiczny](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowLogicErrors.java) (Logic Erors) - błąd powstały w wyniku błędnej konstrukcji logicznej zawartej w programie.


## Podstawowe operatory

| Operator | Nazwa                       | Przykład                                 |
| -------- | --------------------------- | ---------------------------------------- |
| +        | Operator dodawania          | 2+2 => 4                                 |
| -        | Operator odejmowania        | 6-4 => 2                                 |
| *        | Operator mnożenia           | 3*4 => 12                                |
| /        | Operator dzielenia          | 25/7 => 3, bo do w tym przypadku dzielimy liczby całkowite |
| %        | Operator reszty z dzielenia | 35 % 12 => 11, bo 35=2*12+11             |

[Przykład](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/Operators.java) na podstawowe operatory.

Operatory * / % mają wyższy priorytet niż oparetory + -.

W przypadku, gdy w wyrażaniu występują operatory o tym samym priorytecie wykonywane są w kolejności od lewej do prawej.

[Przykład](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/OperatorsPriority.java) na piorytet opratorów. 

Więcej o operatorach można znaleźć na [tej stronie](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).

## Proste programowanie - defininiowanie zmiennych

Pozwalają one na przechowywanie danych różnego typu. Wyróżniamy dwie fazy tworzenia zmiennej:
- **Deklaracja** - tutaj określamy typ i nazwę zmiennej
- **Inicjalizacja** - nadanie wartości zmiennej

```java
public class Variable {
    public static void main(String[] args) {

        int liczba; // Deklaracja

        liczba = 5; // Inicjalizacja
    }
}
```
Zaczynając od początku tworzymy klasę Zmienne (pamiętaj, aby zapisać plik jako *Variable.java*), a w niej tworzymy metodę *main()*. Dalej następuje zadeklarowanie zmiennej typu int i nazwie *liczba* (**deklaracja**), a w kolejnej linii nadajemy jej wartość 5 (**inicjalizacja**). Oczywiście możemy dokonać dwie powyższe instrukcje w jednej linii:

```java
public class Variable2{
    public static void main(String[] args){
        char znak = 'A';
    }
}
```

Schemat tworzenia zmiennych jest prosty

> nazwa_typu nazwa_zmiennej = wartość;

| Przykład            | Wyjaśnienie                              |
| ------------------- | ---------------------------------------- |
| `int x;`            | Deklaracja zmiennej o nazwie `x` przechowującej wartości całkowite |
| `int y = 5;`        | Deklaracja i inicjalizacja zmiennej `y` przechowującej wartości całkowite o wartości `5` |
| `double t;`         | //..                                     |
| `double t = 4;`     | //..                                     |
| `double pi = 3.14;` | //..                                     |

Bardziej zaawansowany przykład

```java
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
```

