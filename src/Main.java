import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Crearea unei liste de numere întregi
        numbers.add(5); // Adăugarea numărului 5 în listă
        numbers.add(9); // Adăugarea numărului 9 în listă
        numbers.add(8); // Adăugarea numărului 8 în listă
        numbers.add(1); // Adăugarea numărului 1 în listă

        // Iterarea prin elementele listei și afișarea acestora folosind o expresie lambda
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
}

























/*
Se importă clasa ArrayList din pachetul java.util.
Este definită clasa Main care conține metoda main, punctul de intrare în program.
Se creează o instanță a clasei ArrayList specializată pentru stocarea numerelor întregi și se numește numbers.
Se adaugă câteva numere întregi (5, 9, 8, 1) în lista numbers.
Se utilizează metoda forEach pentru a itera peste fiecare element din lista numbers.
Expresia lambda (n) -> { System.out.println(n); } este folosită pentru a defini acțiunea care va fi
aplicată fiecărui element din listă. În acest caz, pentru fiecare element n, se afișează în consolă.
*/
