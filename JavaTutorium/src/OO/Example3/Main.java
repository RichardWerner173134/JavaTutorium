package OO.Example3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Personen haben " + Person.ANZAHL_ARME + " Arme");

        Person hans = new Person("Hans", 20, "Zu Hause 1");
        Person personXYZ = new Person("meier", 21, "Die Brücke 76");

        Person derVaterVonHans = new Person("Hansssenior", 55, "Zu Hause 1", hans);

        System.out.println(derVaterVonHans.getName() + ", " + derVaterVonHans.getAlter() + ", " + derVaterVonHans.getAdresse() + ", " + derVaterVonHans.getKind().getName());
        geburtstag(derVaterVonHans);
        System.out.println(derVaterVonHans.getName() + ", " + derVaterVonHans.getAlter() + ", " + derVaterVonHans.getAdresse() + ", " + derVaterVonHans.getKind().getName());

        personXYZ.setName("MEIER2.0");
        derVaterVonHans.setName("Günther");
        personXYZ.setAdresse("dlfkjhgldfhadfkaj");
        derVaterVonHans.setKind(personXYZ);

        personXYZ.setElternteil(derVaterVonHans);

        personXYZ.setGewicht(80);
        personXYZ.bicMacEssen(10);
        System.out.println("personXYZ isFat() = " + personXYZ.isFat());
        personXYZ.bicMacEssen(5);
        System.out.println("personXYZ isFat() = " + personXYZ.isFat());
        personXYZ.bicMacEssen(20);
        System.out.println("personXYZ isFat() = " + personXYZ.isFat());


        derVaterVonHans.vorstellen();

        boolean isFatter = Person.isFatterThan(hans, derVaterVonHans);

        Test t = new Test(1, "asd");
        Test t2 = new Test(1, "asd");
        Test t3 = new Test(1, "asd");
        Test t4 = new Test(1, "asd");
        Test t5 = new Test(1, "asd");

        double x = Math.sqrt(9);


    }

    static void geburtstag(Person person){
        System.out.println("PARTY Geburtstag von " + person.getName());
        person.setAlter(person.getAlter() + 1);
    }
}
