package Gun39._02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5,"Yen Dikdörtgen");
        System.out.println("d = " + d);
        d.ciz();

        Daire dre=new Daire("Yeni Daire",5);
        System.out.println("dr = " + dre);
        dre.ciz();
    }
}
