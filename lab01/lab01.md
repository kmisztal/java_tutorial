### Zadanie 1

Uruchom poniższy kod. W tym celu wykorzystaj Notepad++ oraz wiersz poleceń w Windows.

```java
// To jest program, który wypisze Hello world! 
public class Main {	
  public static void main(String[] args) { 
    System.out.println("Hello world!");
  }
}
```

Aby skompilować kod wydaj polecenie

```bash
javac Main.java
```

aby uruchomić skompilowny program wykonaj polecenie

```bash
java Main
```

### Zadanie 2

Uruchom poniższy kod. Czy jesteś w stanie go poprawić aby uzyskać poprawy wynik, czyli 95?

```java
public class ShowLogicErrors {
  public static void main(String[] args) {
    System.out.println("Celsius 35 is Fahrenheit degree ");
    System.out.println((9 / 5) * 35 + 32);
  }
}
```

### Zadanie 3

Uruchom poniższy kod. Dopisz odpowiednią instrukcję wyswietlającą wartość zmiennej d.

```java 
public class EnterNumber {
  public static void main(String[] args) {
    System.out.print("Enter a double value: ");
	Scanner input = new Scanner(System.in);
	double d = input.nextDouble();
  }
}
```

### Zadanie 4

Wykorzystując powyższy kod uzypełnij ciało metody main w klasie ComputeAverage tak, aby program obliczał średnią z trzech liczb.

```java
public class ComputeAverage {
  public static void main(String[] args) {
	// Create a Scanner object
	Scanner input = new Scanner(System.in);
    
	//...
  }
}
```

### Zadanie 5

Przygotuj program w którym wykorzystasz funkcje z klasy Math

- Zdefiniuj własną stałą PI i przypisz do niej wartość Math.PI
- Wyznacz i wypisz wartość funkcji sin, cos, dla kąta PI/4
- Zaprezentuj działanie funkcji abs
- Zaprezentuj działanie funkcji ceil
- Zaprezentuj działanie funkcji floor