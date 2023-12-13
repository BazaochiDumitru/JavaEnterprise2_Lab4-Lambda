// Definirea unei interfețe funcționale numită "Cab" (reprezentând o cabină)
interface Cab {
    double bookCab(String source, String destination);
}

public class LambdaApp {
    public static void main(String[] args) {
        // Crearea unei instanțe a interfeței "Cab" utilizând expresia lambda
        Cab cab = (source, destination) -> {
            // Afisarea unui mesaj cu sursa și destinația
            System.out.println("UberX Booked from " + source + " to " + destination + " Arriving Soon !!");
            // Returnarea unui preț fictiv (în acest caz, 200)
            return 200;
        };

        // Apelarea metodei bookCab și atribuirea rezultatului la variabila "pret"
        double pret = cab.bookCab("Chisinau", "Balti");

        // Afișarea prețului
        System.out.println("Pret: " + pret + " lei.");
    }
}

















/*
Se definește o interfață funcțională Cab cu o metodă abstractă bookCab, care primește
două argumente de tip String pentru sursă și destinație și returnează un double.
În clasa LambdaApp, se crează o instanță a interfeței Cab utilizând expresia lambda pentru a implementa metoda bookCab.
În expresia lambda, se afișează un mesaj cu sursa și destinația și se returnează un preț fictiv de 200.
Se apelează metoda bookCab pentru a rezerva o cabină și se afișează prețul rezervării.
*/