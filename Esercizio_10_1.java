package esercizi_academy;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Esercizio_10_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci un numero (fino a 3999): ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 3999) {
                System.out.println("Il numero inserito è fuori dal range consentito.");
            } else {
                String numeroRomano = convertiInNumeroRomano(numero);
                System.out.println("Il numero romano corrispondente è: " + numeroRomano);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input non valido. Inserisci un numero intero.");
        } finally {
            scanner.close();
        }
    }




    public static String convertiInNumeroRomano(int numero) {
        int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simboli = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder risultato = new StringBuilder();

        int indice = 0;
        while (numero > 0) {
            int ripetizioni = numero / valori[indice];
            numero %= valori[indice];
            while (ripetizioni > 0) {
                risultato.append(simboli[indice]);
                ripetizioni--;
            }
            indice++;
        }

        return risultato.toString();
    }
}
