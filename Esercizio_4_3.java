package esercizi_academy;

public class Esercizio_4_3 {

    public static void main(String[] args) {
        int n = 10;

        int somma = 0;


        for (int i = 1; i <= n; i++) {
            somma += i;
        }


        System.out.println("La somma dei numeri da 1 a " + n + " è: " + somma);
    }
}
