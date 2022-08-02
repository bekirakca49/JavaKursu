package Gun31.StaticModifier.Ornek1;

import javax.swing.plaf.multi.MultiTableHeaderUI;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Ortaokulu";
    // hepsi için geçerli tek bir tane eleman
    // Tekrarlayan ve tüm nesneler için kullanılacak.
    // değişkenler için STATIC kullanıyoruz.
    // Static= sen bir tanesin

    public Ogrenci(String ad, String Soyad) {
        this.ad = ad;
        this.soyad = Soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", Soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
