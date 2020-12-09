public class Auto {
    String bezeichnung;
    int maxKmh;

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
}
