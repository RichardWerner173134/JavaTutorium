package grundlagen;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String textEingabe = scan.nextLine();

        System.out.println("Hallo " + textEingabe);

        int eingabe = scan.nextInt();
        eingabe = eingabe + 5;

        // 5 zu zahl addieren,
        // ist zahl gleich 20?
        // zahl gleich 25?
        // zahl gleich 30?
        // ansonsten default


        switch(eingabe){
            // ist eingabe == 20?
            case 20:
                System.out.println("IN PFAD 1: Eingabe + 5 = " + eingabe);
                break;
            case 25:
                System.out.println("IN PFAD 2: Eingabe + 5 = " + eingabe);
                break;
            case 30:
                System.out.println("IN PFAD 3: Eingabe + 5 = " + eingabe);
                break;
            default:
                System.out.println("IN PFAD DEFAULT: Eingabe + 5 = " + eingabe);
        }



    }
}
