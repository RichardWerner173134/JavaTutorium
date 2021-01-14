package OO.Example2;

import java.util.Scanner;

public class Terminal {
    private Bank aBank;
    private Scanner standardIn;

    public Terminal() {
        aBank = new Bank("Sparkasse");

        while (true) {
            System.out.println("Konten:");
            for (Konto k : aBank.getKontos()) {
                System.out.print("Inhaber: " + k.getInhaber());
                System.out.print(", Kontonummer: " + k.getNummer());
                System.out.print(", Kontostand: " + k.getKontostand() + "\n");
            }
            System.out.println();
            System.out.println("---------------------------");
            System.out.println();

            System.out.println("Anlegen(1)\neinloggen(2)");
            standardIn = new Scanner(System.in);
            switch (standardIn.nextLine()) {
                case "1":
                    System.out.println("Kontoname eingeben:");
                    String name = standardIn.nextLine();
                    aBank.kontoAnlegen(name, 0.0);
                    break;
                case "2":
                    System.out.println("Kontonummer eingeben");
                    int nummer = standardIn.nextInt();

                    Konto current = aBank.getKontos().get(nummer);
                    boolean logout = false;
                    while (!logout) {
                        System.out.print("Inhaber: " + current.getInhaber());
                        System.out.print(", Kontonummer: " + current.getNummer());
                        System.out.print(", Kontostand: " + current.getKontostand() + "\n");
                        System.out.println("Aktion? \neinzahlen(0)\nauszahlen(1)\nschliessen(2)\nlogout(3)\nueberweisen?(4)");
                        int aktion = standardIn.nextInt();
                        switch (aktion) {
                            case 0:
                                System.out.println();
                                System.out.println("Wieviel einzahlen?");
                                double betrag = standardIn.nextDouble();
                                aBank.geldEinzahlen(nummer, betrag);
                                break;
                            case 1:
                                System.out.println();
                                System.out.println("Wieviel abheben?");
                                double betrag2 = standardIn.nextFloat();
                                aBank.geldAbheben(nummer, betrag2);
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Wirklich schliessen?\n ja(0), nein(1)");
                                int choice = standardIn.nextInt();
                                if (choice == 0) {
                                    aBank.kontoSchliessen(nummer);
                                    logout = true;
                                }
                                break;
                            case 3:
                                logout = true;
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("ZielkontoNummer eingeben");
                                int destKontonr = standardIn.nextInt();
                                System.out.println("Betrag?");
                                double ueberweiseungsbetrag = standardIn.nextDouble();
                                aBank.ueberweisen(current.getNummer(), destKontonr, ueberweiseungsbetrag);
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Terminal();
    }
}
