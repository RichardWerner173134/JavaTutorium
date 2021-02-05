package OO.Example1;

public class Auto {
    public static final int KONSTANTE = 1231723;
    protected String bezeichnung;
    protected int maxKmh;

    public Auto(String bezeichnung, int maxKmh){
        this.bezeichnung = bezeichnung;
        this.maxKmh = maxKmh;
    }

    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        return bezeichnung;
    }

    public int getMaxKmh() {
        return maxKmh;
    }

    public void setMaxKmh(int maxKmh) {
        this.maxKmh = maxKmh;
    }

    public static boolean istSchneller(Auto a1, Auto a2){
        return a1.getMaxKmh() >= a2.getMaxKmh();
    }

    public void überladen1(int x, String s){
        // irgendwas
    }

    public void überladen1(boolean f){
    }

    public void überladen1(){
        // irgendwas
    }

    public void überladen1(String f){
    }


}
