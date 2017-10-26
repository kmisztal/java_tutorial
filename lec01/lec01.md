### Programs

Computer programs, known as software, are instructions to the computer.
Programs are written using programming languages.

### Machine Language

Machine language is a set of primitive instructions built into every computer. The instructions are in the form of binary code, so you have to enter binary codes for various instructions. Program with native machine language is a tedious process. Moreover the programs are highly difficult to read and modify. For example, to add two numbers, you might write an instruction in binary like this:

``` 1101101010011010 ```

### Assembly Language

Assembly languages were developed to make programming easy. Since the computer cannot understand assembly language, however, a program called assembler is used to convert assembly language programs into machine code. For example, to add two numbers, you might write an instruction in assembly code like this:

``` ADDF3 R1, R2, R3 ```

### High-Level Language

The high-level languages are English-like and easy to learn and program. For example, the following is a high-level language statement that computes the area of a circle with radius 5:

```java
area = 5 * 5 * 3.1415;
```

### Interpreting/Compiling Source Code

A program written in a high-level language is called a source program or source code. Because a computer cannot understand a source program, a source program must be translated into machine code for execution. The translation can be done using another programming tool called an interpreter or a compiler.

### Interpreting Source Code

An interpreter reads one statement from the source code, translates it to the machine code or virtual machine code, and then executes it right away, as shown in the following figure. Note that a statement from the source code may be translated into several machine instructions.


### Compiling Source Code

A compiler translates the entire source code into a machine-code file, and the machine-code file is then executed, as shown in the following figure.


## Why Java?

The answer is that Java enables users to develop and deploy applications on the Internet for servers, desktop computers, and small hand-held devices. The future of computing is being profoundly influenced by the Internet, and Java promises to remain a big part of that future. Java is the Internet programming language.

- Java Is Simple - Java is partially modeled on C++, but greatly simplified and improved. Some people refer to Java as "C++--" because it is like C++ but with more functionality and fewer negative aspects.
- Java Is Object-Oriented - Java is inherently object-oriented. Although many object-oriented languages began strictly as procedural languages, Java was designed from the start to be object-oriented. Object-oriented programming (OOP) is a popular programming approach that is replacing traditional procedural programming techniques.  One of the central issues in software development is how to reuse code. Object-oriented programming provides great flexibility, modularity, clarity, and reusability through encapsulation, inheritance, and polymorphism. 
- Java Is Distributed - Distributed computing involves several computers working together on a network. Java is designed to make distributed computing easy. Since networking capability is inherently integrated into Java, writing network programs is like sending and receiving data to and from a file. 
- Java Is Interpreted - You need an interpreter to run Java programs. The programs are compiled into the Java Virtual Machine code called bytecode. The bytecode is machine-independent and can run on any machine that has a Java interpreter, which is part of the Java Virtual Machine (JVM). 
- Java Is Robust - Java compilers can detect many problems that would first show up at execution time in other languages.  Java has eliminated certain types of error-prone programming constructs found in other languages. Java has a runtime exception-handling feature to provide programming support for robustness. 
- Java Is Secure - Java implements several security mechanisms to protect your system against harm caused by stray programs. 
- Java Is Architecture-Neutral - **Write once, run anywhere** With a Java Virtual Machine (JVM), you can write one program that will run on any platform.
- Java Is Portable - Because Java is architecture neutral, Java programs are portable. They can be run on any platform without being recompiled. 
- Java's Performance - Java’s performance Because Java is architecture neutral, Java programs are portable. They can be run on any platform without being recompiled. 
- Java Is Multithreaded - Multithread programming is smoothly integrated in Java, whereas in other languages you have to call procedures specific to the operating system to enable multithreading.
- Java Is Dynamic - Java was designed to adapt to an evolving environment. New code can be loaded on the fly without recompilation. There is no need for developers to create, and for users to install, major new software versions. New features can be incorporated transparently as needed. 

## Pierwszy program

```java
// This program prints Welcome to Java! 
public class HelloWorld {	
  public static void main(String[] args) { 
    System.out.println("Hello world!");
  }
}
```
Program dostępny także pod [tym adresem](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/HelloWorld.java)

### Kompilacja

You can port a source program to any machine with appropriate compilers. The source program must be recompiled, however, because the object program can only run on a specific machine. Nowadays computers are networked to work together. Java was designed to run object programs on any platform. With Java, you write the program once, and compile the source program into a special type of object code, known as bytecode. The bytecode can then run on any computer with a Java Virtual Machine, as shown below. Java Virtual Machine is a software that interprets Java bytecode. 

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

## Anatomia Javy

#### Nazwa klasy
Every Java program must have at least one class. Each class has a name. By convention, class names start with an uppercase letter. In this example, the class name is Welcome. 

```java
public class HelloWorld{
  //---
}
```

#### Metoda `main`
In order to run a class, the class must contain a method named main. The program is executed from the main method. 

```java
public static void main(String [] args){
  //---
}
```

#### Instrukcja
A statement represents an action or a sequence of actions. 

```java
System.out.println("Hello world!");
```

#### Zakończnie instrukcji - średnik - ;
Every statement in Java ends with a semicolon (;).

#### Słowa kluczowe języka (reserved words)
Reserved words or keywords are words that have a specific meaning to the compiler and cannot be used for other purposes in the program. For example, when the compiler sees the word class, it understands that the word after class is the name for the class. 

Znane nam słowa kluczowe to:
- public 
- class
- static 
- void

#### Bloki instrukcji - nawiasy klamrowe - {}
A pair of braces in a program forms a block that groups components of a program. 

#### Symbole specjalne

| Symbol | Znaczenie                    |
| ------ | ---------------------------- |
| {}     | Oznacza blok instrukcji      |
| ()     | Używane z metodami           |
| []     | Oznacza tablicę              |
| //     | Komentarz jednolinijkowy     |
| " "    | Obejmuje ciąg znaków - tekst |
| ;      | Orznacza koniec instrukcji   |

## Błedy 

- [Błąd składniowy](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowSyntaxErrors.java) (Syntax Errors)
- [Błąd czasu wykonania](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowRuntimeErrors.java) (Runtime Errors)
- [Błąd logiczny](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ShowLogicErrors.java) (Logic Erors)


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
        double radius; // Declare radius
        double area; // Declare area

        // Assign a radius
        radius = 20; // New value is radius

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
```

