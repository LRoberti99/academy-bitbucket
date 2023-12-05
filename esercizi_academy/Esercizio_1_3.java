package esercizi_academy;
import java.util.HashMap;
public class Esercizio_1_3 {

    public static void main(String[] args) {

        HashMap<Character, String> morseAlphabet = new HashMap<>();
        morseAlphabet.put('A', ".-");
        morseAlphabet.put('B', "-...");
        morseAlphabet.put('C', "-.-.");
        morseAlphabet.put('D', "-..");
        morseAlphabet.put('E', ".");
        morseAlphabet.put('F', "..-.");
        morseAlphabet.put('G', "--.");
        morseAlphabet.put('H', "....");
        morseAlphabet.put('I', "..");
        morseAlphabet.put('J', ".---");
        morseAlphabet.put('K', "-.-");
        morseAlphabet.put('L', ".-..");
        morseAlphabet.put('M', "--");
        morseAlphabet.put('N', "-.");
        morseAlphabet.put('O', "---");
        morseAlphabet.put('P', ".--.");
        morseAlphabet.put('Q', "--.-");
        morseAlphabet.put('R', ".-.");
        morseAlphabet.put('S', "...");
        morseAlphabet.put('T', "-");
        morseAlphabet.put('U', "..-");
        morseAlphabet.put('V', "...-");
        morseAlphabet.put('W', ".--");
        morseAlphabet.put('X', "-..-");
        morseAlphabet.put('Y', "-.--");
        morseAlphabet.put('Z', "--..");


        String mioNome = "Leonardo";


        StringBuilder morseCode = new StringBuilder();
        for (char letter : mioNome.toCharArray()) {
            if (morseAlphabet.containsKey(Character.toUpperCase(letter))) {
                morseCode.append(morseAlphabet.get(Character.toUpperCase(letter))).append(" ");
            } else {

                morseCode.append(" ");
            }
        }


        System.out.println("Il nome 'Leonardo' in codice morse è: " + morseCode.toString());
    }
}
