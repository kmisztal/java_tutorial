### Zadanie 1

Przygotuj program, który zaprezentuje jak działają operatory

- postinkrementacji
- preinkrementacji
- postdekrementacji
- predekrementacji

### Zadanie 2

Uruchom poniższy kod. Zmodyfikuj kod tak aby promień był wpisywany przez użytkownika.

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

### Zadanie 3

Uruchom i przetestuj poniższy kod.

```java
import java.util.Scanner;

public class ComputeLoan {
  public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter yearly interest rate
    System.out.print("Enter yearly interest rate, for example 8.25: ");
    double annualInterestRate = input.nextDouble();
    
    // Obtain monthly interest rate
    double monthlyInterestRate = annualInterestRate / 1200;

    // Enter number of years
    System.out.print(
      "Enter number of years as an integer, for example 5: ");
    int numberOfYears = input.nextInt();
    
    // Enter loan amount
    System.out.print("Enter loan amount, for example 120000.95: ");
    double loanAmount = input.nextDouble();
    
    // Calculate payment
    double monthlyPayment = loanAmount * monthlyInterestRate / (1
      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    double totalPayment = monthlyPayment * numberOfYears * 12;

    // Display results
    System.out.println("The monthly payment is $" + 
      (int)(monthlyPayment * 100) / 100.0);
    System.out.println("The total payment is $" + 
      (int)(totalPayment * 100) / 100.0);
  }
}
```

### Zadanie 4

Uruchom i przetestuj poniższy kod.

```java
import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount 
    System.out.print(
      "Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of"); 
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters ");
    System.out.println("    " + numberOfDimes + " dimes"); 
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }
}
```

### Zadanie 5

Uruchom poniższy kod. Zmodyfikuj kod, aby pracować na liczbach z przedziału typu byte.

```java
import java.util.Scanner;

public class AdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");

    int answer = input.nextInt();

    System.out.println(
      number1 + " + " + number2 + " = " + answer + " is " +
      (number1 + number2 == answer));
  }
}
```

