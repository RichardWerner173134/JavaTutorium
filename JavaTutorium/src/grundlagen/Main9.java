package grundlagen;

public class Main9 {
    public static void main(String[] args) {

        // Mensch wird geboren
        int alter = 0;

        // While schleife
        while(alter < 18){
            System.out.println("DU BIST MINDERJÄHRIG(" + alter + " Jahre)");
            // ein jahr warten
            alter = alter + 1;
        }

        System.out.println("DU BIST VOLLJÄHRIG (" + alter + " Jahre)");
    }
}
