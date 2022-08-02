package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h2=new P1Hayvan();
        h2.ad="köpek";
       // h2.yas diğer paketten ulaşılamaz
        // h2.cinsi ne ulaşımaz. Fakat extends yaparkan ulaşılabilir. (protected)

        P2Kedi kedi1=new P2Kedi("kopuk","scotish");
        System.out.println("kedi1 = " + kedi1);

    }
}
