package Gun37._06_Ornek;

public class Dikdortgen implements ISekil {

    public double cevre(double... dizi){
        if(dizi.length==1) // kare ise bunu yapacak
            return (dizi[0]+dizi[0])*2;
        double kisaKenar=dizi[0];
        double uzunKenar=dizi[1];
        return (kisaKenar+uzunKenar)*2;
        }
    public double alan(double... dizi){
        if(dizi.length==1) // kare ise bunu yapacak
            return (dizi[0]*dizi[0]);

        double kisaKenar=dizi[0];
        double uzunKenar=dizi[1];
        return (kisaKenar*uzunKenar);
    }
}
