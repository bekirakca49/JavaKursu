package Gun37._06_Ornek;

public class Daire implements ISekil{

    public double alan(double... dizi){
        return Math.PI*dizi[0]*dizi[0];
    }
    public double cevre(double... dizi){
        return Math.PI*dizi[0]*2;
    }
}

