package grundlagen;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int a = 5;

        // arrays über [] deklarieren
        int[] array;
        array = new int[]{5, 4, 2, 1, 9, 123, 8};
        System.out.println(array[0]);

        String [] stringArray = new String[10];
        stringArray[0] = "Hier steht Wert 0";
        stringArray[1] = "l.dnfs";
        stringArray[2] = "wöoezuirö";
        stringArray[3] = "lkösdjnh";
        stringArray[4] = "jewzolk2";
        stringArray[5] = "iulz324";
        stringArray[6] = "ölskdjf";
        stringArray[7] = "slö.df";

        int[][] zweidimArray = new int[5][5];

        Random r = new Random();
        for(int i = 0; i < zweidimArray.length; i++){
            for(int j = i; j < zweidimArray[1].length; j++){
                zweidimArray[i][j] = r.nextInt();
            }
        }

    }
}
