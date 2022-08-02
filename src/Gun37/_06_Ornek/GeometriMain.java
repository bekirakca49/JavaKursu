package Gun37._06_Ornek;

import Gun37._06_Ornek.Dikdortgen;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();

        System.out.println("d.alan(4,5) = " + d.alan(4,5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4,5));
        
        Daire dr=new Daire();
        System.out.println("dr.alan(5) = " + dr.alan(5));
        System.out.println("dr.cevre(5) = " + dr.cevre(5));

        Kare k=new Kare();
        System.out.println("k.alan(3) = " + k.alan(3));
        System.out.println("k.cevre(3) = " + k.cevre(3));

    }
}
