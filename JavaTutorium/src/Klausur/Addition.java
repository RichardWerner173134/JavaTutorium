package Klausur;

public class Addition {
    private double x1;
    private double x2;

    public Addition(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    double berechneErgebnis(){
        return x1 + x2;
    }
}
