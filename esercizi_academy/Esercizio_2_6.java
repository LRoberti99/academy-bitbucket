package esercizi_academy;

public class Esercizio_2_6 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array originale:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int posizioneDaEliminare = 4;

        for (int i = posizioneDaEliminare; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = array[array.length - 2] + 1;

        System.out.println("\nIl nuovo Array, dopo l'eliminazione e lo shift:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
