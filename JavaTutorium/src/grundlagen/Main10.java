package grundlagen;

public class Main10 {
    public static void main(String[] args) {

        // Zählvariable, Bedingung, Veränderung
        for(int i = 0; i < 18; i++){
            //System.out.println("DU BIST MINDERJÄHRIG (" + i + " Jahre)");
        }

        //System.out.println("DU BIST VOLLJÄHRIG (18 Jahre)");

        /*int summeErstenNZahlen = sum(1000);
        int summeErstenNZahlen2 = sum2(1000);
        System.out.println(summeErstenNZahlen);
        System.out.println(summeErstenNZahlen2);
        test();
*/
        int[] array;
        array = new int[]{5, 4, 2, 1, 9, 123, 8};

        int erg = berechneSumme(array);
        System.out.println("SUMME VOM ARRAY " + erg);

        int [][] zweidim = new int[3][2];
        // zweidim = [1, 2][2, 4][6, 1]
        for(int i = 0; i < zweidim[0].length; i++){
            for(int j = i; j < zweidim[1].length; j++){
                System.out.println(zweidim[i][j]);
            }
        }

    }



    static int sum(int n){
        int ergebnis = 0;

        // berechnung
        for(int i = 1; i <= n; i++){
            ergebnis = ergebnis + i;
        }

        return ergebnis;
    }

    static int sum2(int n){
        int ergebnis = 0;

        int i = 1;

        // berechnung
        while(i <= n){
            ergebnis = ergebnis + i;
            i = i + 1;
        }

        return ergebnis;
    }

    static void test(){
        for(int i = 5001; i < 1271276; i = i + 250){
            System.out.println(i);
        }
    }

    static int berechneSumme(int[] arr){
        int ergebnis = 0;

        // berechnung
        for (int i = 0; i < arr.length; i++){
            ergebnis = ergebnis + arr[i];
        }

        return ergebnis;
    }

}
