package esercizi_academy;

public class Esercizio_2_9 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Array originale:");
        stampaUnArray(array);

        int mezzo = array.length / 2;

        for (int i = 0; i < mezzo; i++) {
            int temp = array[i];
            array[i] = array[i + mezzo];
            array[i + mezzo] = temp;
        }

        System.out.println("\nArray dopo lo scambio :");
        stampaUnArray(array);
    }
    public static void stampaUnArray(int[] arr) {
        for (int numero : arr) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
