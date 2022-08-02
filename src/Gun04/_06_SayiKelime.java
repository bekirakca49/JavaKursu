package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        String girilenKelime="65";  // bu haliyle mesala Ahmet kelimesinden farksız toplama yapılamaz.
        System.out.println("girilenKelime = " + girilenKelime);
        // Kelimenin -> sayıya çevrilmesi

        int intDeger=Integer.parseInt(girilenKelime);
        double doubleDeger=Double.parseDouble(girilenKelime);

        int sayi=intDeger;
        String durum="Bu gün hava 15 derece";
                //burda 15 String rakam olarak algılayabilmesi icin int dönüştürülmeli.
                // int dereceSayi=Integer.parseInt(dereceYazi);
        System.out.println("sayi = " + sayi);
        System.out.println("doubleHali = " + doubleDeger);
        System.out.println("intDeger = " + intDeger);

        /* Rakamı yazıya çevirmek */
        // Hava sıcaklığını rakam olarak tanımlayınız ve  bir cümle şeklide
        // Bu gün hava 12 derece yazdırınız.
        int sicaklik=12;
        System.out.println("Bugün hava "+sicaklik+" derece."); // otamatik hali

        String sicaklikKelimeHali=Integer.toString(sicaklik);  // dönüşüm yaşadı, bundan sonra toplanamaz
        // int toplam=sicaklikKelimeHali+SicaklikKelimeHali;  // toplanamaz

        System.out.println("Bugün hava "+sicaklikKelimeHali+" derece."); // dönüştürülüp yazıldı.

    }
}
