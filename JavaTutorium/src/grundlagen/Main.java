package grundlagen;

public class Main {


    public static void main(String[] args) {
        // Deklaration
        int x;
        int y;

        // Initialisierung
        x = 5;
        y = -9;

        // Zuweisung
        x = 10;
        y = x;

        char c;
        c = 'J';

        // nicht möglioh sind Bezeichner, die : Operatoren enthalten, Keywords, Leerzeichen, Zahlen am Anfang, bestimmte Sonderzeichen
        int maxKmH;

        String s = "Ich schreibe gerne Java";

        System.out.println(s);

        // Operatoren
        x = 10  + 6;
        x = x + 1;
        x++;
        x += 5;
        x = x + 5;

        x = x - 100;
        x = x-1;
        x--;
        x-=56;

        x = 5*10;
        x = x * 10;
        x  *= 2;

        x = x / 4;

        // boolean

        boolean boo = true;

        // Vergleichsoperatoren: ==, !=; <, >, <=, >=

        // Ausdruck: "Weise boo den Wert aus folgender Frage zu: Ist 5 gleich x?"
        boo = (5 == x);


        boolean boo2 = (!(25 == 5*10 || true)) && (10-2 == 2 || 2<3);

    }
}
