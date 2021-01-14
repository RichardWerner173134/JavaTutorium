package grundlagen;

public class Main4 {
    public static void main(String[] args) {
        gibKonsolenAusgabeAus();

        int a = 0;
        a = berechneWas(a);

        System.out.println(isTrue(true, true));

        short short1 = 12;
        short short2 = 13;
        int sum = addShorts(short1, short2);


        // Funktionsaufruf durch Bezeichner der Funktion, (), Argumente in den Klammern
        double ergebnis = malDrei(1,2,3);

        doIt(3);
    }

    static void gibKonsolenAusgabeAus(){
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        System.out.println("HALLO ICH BIN IN DER METHODE");
        //kein return statement
    }

    // Rückgabewert int, Argument int x
    static int berechneWas(int x){
        return x+1;
    }

    // Rückgabewert boolean, Argumente boolean b1, b2
    static boolean isTrue(boolean b1, boolean b2){
        boolean ergebnis = b1 && b2;
        return ergebnis;
    }

    // Rückgabewert int, Argumente short s1, s2
    static int addShorts(short s1, short s2){
        int ergebnis = s1 + s2;
        return ergebnis;
    }

    // Rückgabewert double, Argumente int x1, x2, x3
    static double malDrei(int x1, int x2, int x3){
        double ergebnis = x1 * x2 * x3;
        return ergebnis;
    }

    static int malDreiKomisch(double d1, double d2, double d3){
        int ergebnis = (int) (d1 * d2 * d3);
        return ergebnis;
    }

    static String getRandomString(String s1, String s2, String s3){
        String s4 = "ihjdflksj";
        return s1 + s2 + s3;
    }

    static int[] getInts(int x, int y){
        int [] a = new int[2];
        a[0] = x;
        a[1] = y;
        return a;
    }

    static String[][] getNewArray(){
        return new String[5][5];
    }

    static void doIt(int y){
        int x = 0;
        System.out.println(x + 5);
        System.out.println(y);
        String a = "asd";
    }

    // Funktion besteht aus
    // Datentyp, welcher zurückgegeben wird
    // bezeichner
    // (Argument bezeichnerArgument1, ...){
    // return
    // }

}
