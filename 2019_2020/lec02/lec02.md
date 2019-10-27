Programowanie obiektowe w Javie - lec02
=======================================

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

