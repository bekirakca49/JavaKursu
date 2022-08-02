package Gun33.EnumEk;

import Gun30.PrivateErisim.Calisan;
import Gun32._01_Ornek.OrnekEnum;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay=Aylar.AGUSTOS;

        // yeni Nesil yöntemler
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.isim = " + ay.isim);
        // hepsini yazdırır
        for (Aylar a: Aylar.values())
            System.out.println(a.ordinal()+" " + a);

    }
}
