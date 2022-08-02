package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız. fields: name, publishYear, autor.
        // 3 adet Constructor ekleyiniz.
        // kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Kitap kitap4=new Kitap();
        kitap4.name="Kel Ali";
        kitap4.publichYear=1973;
        kitap4.author="Ali";


        Kitap kitap1=new Kitap("İnce Mehmet",1927,"Yaşar Kemal");
        Kitap kitap2=new Kitap("coğrafya",2022,"Hasan");
        Kitap kitap3=new Kitap("fizik",1999,"Kel Ali");
        Kitap kitap5=new Kitap("fizik",1991);

        System.out.println("kitap1 = " + kitap1.name);
        System.out.println("kitap2 = " + kitap2.name);
        System.out.println("kitap3 = " + kitap3.name);
        System.out.println("kitap4 = " + kitap4.name);

        kitap1.Yazdir();
        kitap2.Yazdir();
        kitap3.Yazdir();
        kitap4.Yazdir();
        kitap5.Yazdir();

        int sayi=5;
        System.out.println("sayi = " + sayi); // bilgisiyar ekrana String olarak gönderiyor. yani toString yaparak

        System.out.println(kitap1);
        // zaten her zaman ekrana yazacağı zaman
        // toString metodunu kullanıyor.
    }
}


