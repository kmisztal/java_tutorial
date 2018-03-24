## Zadanie 1

Korzystajac z ponizszych definicji:
```java
enum Country{
	Poland, German;
}

enum Hobby{
	Dance, Tennis;
}
class People{
	Country country;
	Hobby hobby;
	String name;
	double salary;
}
```
1. Napisz metodę `populate()` w klasie `People`, która zwraca listę osób:
	- Jan, Poland, Dance, 1900;
	- Marek, Poland, Dance, 2600;
	- Paul, German, Tennis, 4000;
	- Jan, German, Dance, 500;
	- Tom, German, Tennis, 3000;
2. Wypisze listę wykorzystując funkcje lambda.
3. Wykorzystując interfejs `Predicate` wypisz osoby które tanczą.
4. Policz osoby które uprawiają tenis.
5. Wykorzystując dwa interfejsy `Predicate` policz ilu Niemców lubi tańczyć.
6. Wypisz Niemca, który zarabia najwięcej.
7. Posortuj osoby malejąco po wysokości zarobków
8. Posortuj osoby rosnąco po imionach (kolejność alfabetyczna)
9. Pogrupuj osoby po narodowości