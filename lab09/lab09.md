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

1. Napisz metode populate() w klasie People która zwraca liste osób:
	- Jan, Poland, Dance, 1900;
	- Marek, Poland, Dance, 2600;
	- Paul, German, Tennis, 4000;
	- Jan, German, Dance, 500;
	- Tom, German, Tennis, 3000;
2. Wypisze liste wykorzystujac funkcje lambda.
3. Wykorzystujac interfejs Predicate wypisz osoby które tancza.
4. Policz osoby które uprawiaja tenis.
5. Wykorzystujac dwa interfejsy Predicate policz ilu Niemców lubi tanczyc.
6. Wypisz Niemca który zarabia najwiecej.
7. Posortuj osoby malejaco po wysokosci zarobków
8. Posortuj osoby rosnaco po imionach (kolejnosc alfabetyczna)
9. Pogrupuj osoby po narodowosci