package esercizi_academy;

public class Esercizio_5_7 {

    public static void main(String[] args) {
        String creditCard = "4123-5678-9012-3450";
        String nuova = removeSpacesHighDashes(creditCard);

        System.out.println("Stringa originale: " + creditCard);
        System.out.println("Stringa senza spazi e trattini: " + nuova);
    }

    public static String removeSpacesHighDashes(String input) {
        StringBuilder result = new StringBuilder();

        // Ciclo
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);


            if (carattere != ' ' && carattere != '-') {
                result.append(carattere);
            }
        }

        return result.toString();
    }
}
