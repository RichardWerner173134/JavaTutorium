package grundlagen;

public class Main2 {
    public static void main(String[] args) {
        // implizite Typumwandlung
        int x = 10;
        double y = 20.0;

        // 10 / 7 - 20.0
        System.out.println(x / 7 - y);

        // explizite Typumwandlung (casting)
        System.out.println((double) x / 7 - y);

        int z = (int) 20.7;
        System.out.println(z);

        // SCript

        short shorty = 3;
        int j = 5;

        // Typumwandlung von kleinere in größere Werte möglich

        //
        //  10;
        // 0010;

        // 00001000000; // int
        //       00101; // short
        // 00000000101; // == int mit selbem Wert wie short

        int i = shorty + j;
        // geht nicht
        // short i = shorty + j;

        double dublly = i + shorty;
        double dddd =1.0 / 1;

        double komischerI = (int)5.5f + 4.4f;
        int komischerI2 = (int)(5.5f + 4.4f);

    }

}
