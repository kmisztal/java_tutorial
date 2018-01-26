## Zadanie 1

Napisz program, który:

- wypełni losowo 0 i 1 tablicę o rozmiarze 4-na-4,
- wypisze ją
- wypisze, w którym wierszu jest najwięcej 0 a w którym wierszu jest najwięcej 1

\* Spóbuj wykornać całę zadanie roz przechodząc po tablicy.

## Zadanie 2 \*

Napisz grę w kóło-krzyżyk na planszy 3x3. Postaraj się sam wykrywać kto wygrał. Czy możesz sprawić, aby komputer był Twoim oponentem?

## Zadanie 3

W tablicy dwuwymiarowej zebrano współrzędne punktów z płaszczyzny. Napisz funkcję sortującą, która posortuje te punkty według zasady, że najpierw sortuje punkty według pierrwszej współrzędnej, a pózniej jeśli punkty mają taką samą pierwszą współrzędną sortuje je według drugiej współrzędnej.  Swoje rozwiązanie możesz oprzeć o bąbelkowym algorytmie sortowania.

## Zadanie 4

Utwórz obiekty klasy `Date` podając jako argumenty konstruktora 10000, 100000, ..., 100000000000. Wypisz jaką datę opisują te obiekty.

## Zadanie 5

Wykorzystaj `System.currentTimeMillis()` do napisania klasy `Timer`, która mierzy czas pomiedzy jej utworzeniem a wywołaniem jej metody `getCurrentTime`. Zapewnij, aby konstrukcja klasy uniemożliwiała oszustwo polegające na podmienieniu czasu początkowego.

> Uwaga: Profesjonalnie należałoby skorzysać z klasy `Instant` i `Duration`  [Zobacz więcej: Period and Duration](https://docs.oracle.com/javase/tutorial/datetime/iso/period.html)

## Zadanie 6 \*

Kontynuując pracę z kodem 

```java
public class Painter extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // wywołanie domyślnyc akcji z klasy bazowej
        g.drawLine(20, 80, 20, 200); // narysowanie linii
        g.drawLine(20, 200, 140, 200); // narysowanie linii

        g.setColor(Color.RED);
        g.fillOval(100, 100, 20, 40);

        g.drawString("Test", 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Okienko"); // utworzenie obiektu okna
        frame.add(new Painter()); // dodanie panelu
        frame.setSize(300, 300); // rozmiar okienka
        frame.setLocationRelativeTo(null); // wyśrodkowanie do centrum ekranu
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // wyświetlenie
    }
}
```

Przygotuj większą liczbę różnych klas opisujących różne typy figur.