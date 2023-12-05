package esercizi_academy;
import java.util.Random;

public class Esercizio_3_3 {
    static String[][] scacchiera = new String[3][3];

    public static void main(String[] args) {
        assegnaAngoloSuperioreDestro();

        stampaScacchieraConRigheEColonneSeparate();
    }
    public static void assegnaAngoloSuperioreDestro() {
        scacchiera[0][2] = "x";

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (scacchiera[i][j] == null) {
                    int randomValue = random.nextInt(3);
                    if (randomValue == 0) {
                        scacchiera[i][j] = "o";
                    } else {
                        scacchiera[i][j] = " ";
                    }
                }
            }
        }
    }
    public static void stampaScacchieraConRigheEColonneSeparate() {

        System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print(" | " + scacchiera[i][j] + " ");
                } else if (j == 2) {
                    System.out.println("| " + scacchiera[i][j] + " |");
                } else {
                    System.out.print("| " + scacchiera[i][j] + " ");
                }
            }
            System.out.println("------------");
        }
        System.out.println("I valori che si trovano sulla diagonale che collega la casella superiore sinistra e la casella inferiore destra sono: ");
        System.out.println(scacchiera[0][0] + ", " + scacchiera[1][1] + ", " + scacchiera[2][2]);
    }
}
