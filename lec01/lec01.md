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

Kolejne przykłady:

- [ComputeExpression](https://github.com/kmisztal/java_tutorial/blob/master/lec01/src/ComputeExpression.java) - program, który wyliczy wartość przykłądowego wyrażenia.