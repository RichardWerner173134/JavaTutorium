package grundlagen;

public class Main7 {
    public static void main(String[] args) {
        // if else if

        // 1= A KUNDE; 2 = B KUNDE; 3= C KUNDE
        int test = 1;


        // A KUNDE??
        if(test == 1){
            System.out.println(test + ": A KUNDE");
        } else if(test == 2){
            System.out.println(test + ": B KUNDE");
        } else if(test == 3){
            System.out.println(test + ": C KUNDE");
        } else {
            System.out.println(test + ": Falsch");
        }

        switch(test){
            case 1:
                System.out.println(test + ": A KUNDE");
                break;
            case 2:
                System.out.println(test + ": B KUNDE");
                break;
            case 3:
                System.out.println(test + ": C KUNDE");
                break;
            default:
                System.out.println(test + ": Falsch");
        }



    }
}
