1. Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście. 
	- Następnie wypisz zawartość tej listy korzystając ze strumienia oraz mechanizmu odwoływania się do metody (przy pomocy ::).
	- Następnie posortuj tę listę używając metody sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
2. Klasa `B` dziedziczy po klasie `A` oraz implementuje interfejs `Szyfrator`. Dodatkowo:
	- klasa `A` posiada pole typu całkowitoliczbowego o nazwie `value` inicjalizowane w konstruktorze
	- klasa `A` nie posiada konstruktora domyślnego
	- interfejs `Szyfrator` posiada abstrakcyjną metodę `code` nie przyjmującą wartości i nic nie zwaracającą
	- interfejs `Szyfrator` posiada abstrakcyjną metodę `decode` nie przyjmującą wartości i nic nie zwracającą
	- klasa B dostarcza implementacji metod `code` i `decode` odpowiednio przez pomnożenie wartości przechowywanej w polu `value` przez 13 i podzielenie tej wartości przez 13 - czyli tym samym symulujemy szyfrowanie zawartości pola `value`
	- Przygotuj kod który dla metody `main` 
    ```java
	public static void main(String[] args) {
		B b = new B(12);

		System.out.println(b);
		b.code();
		System.out.println(b);
		b.decode();
		System.out.println(b);
	}
	//wypisze
	// 12
	// 156
	// 12
	```