## Agregacja

Agregacja (inaczej zawieranie się, gromadzenie) – sytuacja, w której tworzy się nową klasę, używając klas już istniejących (często nazywa się to "tworzeniem obiektu składowego"). Nowa klasa może być zbudowana z dowolnej liczby obiektów (obiekty te mogą być dowolnych typów) i w dowolnej kombinacji, by uzyskać żądany efekt. Agregacja jest często określana jako relacja typu "zawiera" np. "samochód zawiera silnik" - gdzie "samochód" i "silnik" są klasami, oraz klasa "samochód" zawiera w sobie obiekt (czasami referencję czy wskaźnik) typu "silnik".

Agregacja jest często przedstawiana w opozycji do dziedziczenia, które polega na uszczegóławianiu typu ogólnego w celu utworzenia typu szczególnego. Agregacja nie tworzy podtypu, lecz nowy typ.

```java
class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}
class StudentClass
{
   int rollNum;
   String studentName;
   //Creating HAS-A relationship with Address class
   Address studentAddr; 
   StudentClass(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   ...
}
class College
{
   String collegeName;
   //Creating HAS-A relationship with Address class
   Address collegeAddr; 
   College(String name, Address addr){
       this.collegeName = name;
       this.collegeAddr = addr;
   }
   ...
}
class Staff
{
   String employeeName;
   //Creating HAS-A relationship with Address class
   Address employeeAddr; 
   Staff(String name, Address addr){
       this.employeeName = name;
       this.employeeAddr = addr;
   }
   ...
}
```

#### Kompozycja

Kompozycja, zwana również złożeniem, jest związkiem typu całość-część. W relacji kompozycji, części należą tylko do jednej całości, a ich okres życia jest wspólny — razem z całością niszczone są również części.

Kompozycja oznacza, że dana część może należeć tylko do jednej całości. Oznacza również, że część nie może istnieć bez całości, a usunięcie całości powoduje automatyczne usunięcie wszystkich jej części, związanych z nią związkiem kompozycji.



## Asocjacja

Asocjacja wskazuje na trwałe powiązanie pomiędzy obiektami danych klas (np. firma zatrudnia pracowników).

```java
class CarClass{
   String carName;
   int carId;
   CarClass(String name, int id)
   {
	this.carName = name;
	this.carId = id;
   }
}
class Driver extends CarClass{
   String driverName;
   Driver(String name, String cname, int cid){
	super(cname, cid);
	this.driverName=name;
   }
}
class TransportCompany{
   public static void main(String args[])
   {
	Driver obj = new Driver("Andy", "Ford", 9988);
	System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
   }
}
```

## Argumenty wiersza poleceń

```bash
java Demo arg1 arg2 arg3 …
```

```java
class Demo{
     public static void main(String b[]){
         System.out.println("Argument one = "+b[0]);
         System.out.println("Argument two = "+b[1]);
    }
}
```





### Metoda `equals`

Domyślnie sprawdzana jest tylko refrencja

```java
public boolean equals(Object obj) {
	return (this == obj);
}
```

ale czasem można chcieć czegoś więcej, np.:

```java
public boolean equals(Object o) {
  if (o instanceof Circle)
  	return radius == ((Circle)o).radius;
  else
  	return this == o;
}
```
### Interfejs `Comparable`

```java
// Interface for comparing objects, defined in java.lang
package java.lang;

public interface Comparable<E> {
	public int compareTo(E o);
}
```
### Interface `Comparable`

```java
interface Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return //...;
    }
}
```

### Przykład

```java
public class CompareTest implements Comparable<CompareTest> {
    private int a;
    private float b;
    private String c;

    public CompareTest(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompareTest that = (CompareTest) o;
        return a == that.a &&
                Float.compare(that.b, b) == 0 &&
                Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "CompareTest{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CompareTest x = new CompareTest(1, 1.f, "one");
        CompareTest y = new CompareTest(-1, 2.f, "two");
        CompareTest xx = new CompareTest(1, 1.f, "one");


        System.out.println(x.equals(y));
        System.out.println(x.equals(xx));


        List<CompareTest> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(xx);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<CompareTest>() {
            @Override
            public int compare(CompareTest o1, CompareTest o2) {
                return (int) (o1.b-o2.b);
            }
        });
        System.out.println(list);
    }

    @Override
    public int compareTo(CompareTest o) {
        return (this.a - o.a);
    }
}
```





## Wyjątki

Jak sobie radzić z problematycznymi sytuacjami? Zawsze można uzyć `if`

```java
import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2
                    + " is " + (number1 / number2));
        else
            System.out.println("Divisor cannot be zero ");
    }
}
```

Można też specjalnie przygotować metodę

```java
import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is "
                + result);
    }
}
```

Ale najlepiej **rzucić wyjątek**

```java
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) throw new ArithmeticException("Divisor cannot be zero");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is "
                    + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero ");
        }

        System.out.println("Execution continues ...");
    }
}
```



