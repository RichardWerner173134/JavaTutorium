package grundlagen;

public class Main5 {
    public static void main(String[] args) {
        // if
        System.out.println("Rein in die Verzweigung");
        int i = 0;
        int j = 16;
        if( (!(25 == 5*10 || true)) && (10-2 == 2 || 2<3)){
            System.out.println(i);
            System.out.println(j);
        }

        System.out.println("weiter im Text");

        if(j > 15){
            j = j + 1;
        }
        System.out.println(j);
    }
}
