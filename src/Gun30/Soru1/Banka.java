package Gun30.Soru1;

public class Banka {
    // Hesap (yatan, cekilen,bakiye(direk erişim olmamalı)
    // Musteri (hesapID, ad, soyad, MusteriHesap(Hesap tipinde)
    // Bir banka uygulaması için müşteri tanımlayınız,
    // müşterinin hesabına sırasıyla 100 tl, 200 tl yatırınız.
    //sonra 50 tl çekiniz. Müşterinin kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadığını kontrol ediniz.
    public static void main(String[] args) {

        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Hatice";
        mus1.soyad="Namlı";
        mus1.musteriHesap=new Hesap();

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("Exrat = " + mus1.musteriHesap);
        //mus1.musteriHesap.bakiye ulaşılamıyor, test i geçti
    }
}
