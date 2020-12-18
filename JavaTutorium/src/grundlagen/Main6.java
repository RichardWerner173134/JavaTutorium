package grundlagen;

public class Main6 {
    public static void main(String[] args) {
        // if else

        int alter = 18;

        if(alter >= 18){
            System.out.println("hier sind deine Kippen");
        } else {
            System.out.println("Verpiss dich hier gibt es keine Kippen");
        }
        // modulo
        // 10 % 3 = 1
        // 15 % 4 = 3
        // 20 % 6 = 2
        // 15 % 3 = 0
        // 16 / 5 = 3
        // 10 / 3 = 3

        int zahl = 27;

        if(zahl % 2 == 0){
            System.out.println(zahl +  " ist gerade");
        } else{
            System.out.println(zahl + " ist ungerade");
        }

        if(zahl % 2 != 0){
            System.out.println(zahl + " ist ungerade");
        } else{
            System.out.println(zahl + " ist gerade");
        }


    }
}
