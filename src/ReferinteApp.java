// Definirea interfeței funcționale "Calculator" cu metoda "add".
interface Calculator {
    void add(int num1, int num2);
}

// Clasa "Calc" cu o metodă "letsAdd" care adună și afișează rezultatul.
class Calc {
    public void letsAdd(int num1, int num2) {
        System.out.println(num1 + " plus " + num2 + " este egal cu " + (num1 + num2));
    }
}

// Clasa "ReferinteApp" pentru demo-ul utilizării referințelor către metode.
public class ReferinteApp {
    public static void main(String[] args) {
        // Crearea unei instanțe a clasei "Calc"
        Calc calc = new Calc();

        // Crearea unei referințe la metoda "letsAdd" din clasa "Calc"
        Calculator cRef = calc::letsAdd;

        // Apelarea metodei "add" prin intermediul referinței
        cRef.add(12, 23);
    }
}














/*
Se definește interfața funcțională "Calculator" cu o metodă "add" care primește doi intei și nu returnează nimic.
Clasa "Calc" are o metodă "letsAdd" care adună cei doi intei și afișează rezultatul.
În clasa "ReferinteApp", se creează o instanță a clasei "Calc".
Se creează o referință la metoda "letsAdd" din clasa "Calc" utilizând operatorul ::.
Prin intermediul referinței, se apelează metoda "add" și se afișează rezultatul adunării.
*/
