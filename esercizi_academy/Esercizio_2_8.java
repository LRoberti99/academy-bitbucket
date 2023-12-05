package esercizi_academy;
import java.util.Random;

public class Esercizio_2_8 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] frequenze = new int[6];


        for (int i = 0; i < 10000; i++) {
            int lancioDado = r.nextInt(6) + 1;
            frequenze[lancioDado - 1]++;
        }


        System.out.println("Frequenza delle facce del dado dopo 1000 lanci:");
        System.out.println("+-----------+-----------+");
        System.out.println("| Faccia    | Frequenza  |");
        System.out.println("+-----------+-----------+");
        for (int i = 0; i < 6; i++) {
            int numeroFaccia = i + 1;
            System.out.printf("|    %-6d |    %-7d |\n", numeroFaccia, frequenze[i]);
        }
        System.out.println("+-----------+-----------+");
    }
}
