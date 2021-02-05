package OO.Example1;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Einfaches Auto", 100);
        Porsche porsche1 = new Porsche("Mein SuperPorsche", 400, 97);
        Auto auto2 = new Porsche("Der zweite Porsche", 300, 60);

        System.out.println(auto1.getMaxKmh());
        System.out.println(porsche1.getMaxKmh());
        System.out.println(auto2.getMaxKmh());

        int x = 0;

        Auto avatarAuto = null;

        if(x <= 10){
            avatarAuto = new Polo("Polo", 60);
        } else {
            avatarAuto = new Porsche("SuperPorsche", 1234, 123);
        }

        if(avatarAuto instanceof Polo){
            System.out.println("Das ist ein Polo");
        } else if(avatarAuto instanceof Porsche){
            System.out.println("Das ist ein Porsche");
        } else {
            System.out.println("Das ist irgendwas anderes");
        }

        System.out.println("Avatar fährt mit " + avatarAuto.getBezeichnung() + " und hat eine maxKMH von " + avatarAuto.getMaxKmh());
    }
}
