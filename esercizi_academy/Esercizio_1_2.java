package esercizi_academy;

public class Esercizio_1_2 {

    public static void main(String[] args) {
        double saldoDiPartenza = 1000;
        double tasso = 0.05;
        double saldoPrimoAnno = saldoDiPartenza + (saldoDiPartenza * tasso);
        double saldoSecondoAnno = saldoPrimoAnno + (saldoPrimoAnno * tasso);
        double saldoTerzoAnno = saldoSecondoAnno + (saldoSecondoAnno * tasso);

        //Stampiamo i saldi
        System.out.println("Saldo dopo il primo anno: " + saldoPrimoAnno + " $");
        System.out.println("Saldo dopo il secondo anno: " + saldoSecondoAnno + " $");
        System.out.println("Saldo dopo il terzo anno: " + saldoTerzoAnno + " $");
    }
}
