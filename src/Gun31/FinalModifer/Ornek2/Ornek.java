package Gun31.FinalModifer.Ornek2;

import Gun31.StaticModifier.Ornek2.School;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gün, saat, dakika alarak toplam saniyeyi bulunuz.

        int gun=0;
        int saat=0;
        int dak=0;
        Scanner oku=new Scanner(System.in);
        System.out.print("Gün: "); gun=oku.nextInt();
        System.out.print("Saat: "); saat=oku.nextInt();
        System.out.print("Dakika: "); dak=oku.nextInt();

        int toplamSaniye=
        gun*Sabitler.birGundekiSaatSayisi*Sabitler.birDakikadakiSaniyeSayisi*Sabitler.birSaatdekiDakSayisi+
                saat*Sabitler.birSaatdekiDakSayisi*Sabitler.birDakikadakiSaniyeSayisi+
                dak*Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        System.out.println("Sabitler.hesapla(gun,saat,dak) = " + Sabitler.hesapla(gun,saat,dak));
    }
}
