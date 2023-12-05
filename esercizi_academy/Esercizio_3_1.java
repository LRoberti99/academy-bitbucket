package esercizi_academy;

public class Esercizio_3_1 {
    static int[][] tabellone = new int[10][9];

    public static void main(String[] args) {
        // Popolamento del tabellone con valori crescenti (da 1 a 90)
        int contatore = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                tabellone[i][j] = contatore++;
            }
        }

        int riga = 8;
        int colonna = 7;

        System.out.println("Elementi intorno alla posizione (" + riga + ", " + colonna + "):");
        stampaElementiIntorno(riga, colonna);

        int num = prendiNumeroDaCoordinate(riga, colonna);
        System.out.println("\nIl numero corrispondente alla posizione (" + riga + ", " + colonna + ") è: " + num);
    }

    public static void stampaElementiIntorno(int riga, int colonna) {
        for (int i = riga - 1; i <= riga + 1; i++) {
            for (int j = colonna - 1; j <= colonna + 1; j++) {
                if (i >= 0 && i < 10 && j >= 0 && j < 9) {
                    if (i == riga && j == colonna) {
                        System.out.print("Coordinate (" + i + ", " + j + "): " + tabellone[i][j] + " (CENTRO)  ");
                    } else {
                        System.out.print("Coordinate (" + i + ", " + j + "): " + tabellone[i][j] + "  ");
                    }
                } else {
                    System.out.print("Coordinate (" + i + ", " + j + "): BORDO  ");
                }
            }
            System.out.println();
        }
    }

    public static int prendiNumeroDaCoordinate(int riga, int colonna) {
        return tabellone[riga][colonna];
    }
}
