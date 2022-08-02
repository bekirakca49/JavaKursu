package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;

        String ad="İsmet";  // String ifadelerin sayı gibi bir sınırı olmadığından "" ile sınırı belli edilir.
        String soyad="Temur"; //  Temur\n veya farklı özel bir karekter koyarak bilgisayar sınırını belirliyor.

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad"+"soyad");  // ekrana ad soyad   yazar
        System.out.println(ad+soyad); // İsmetTemur yazar
        System.out.println(ad+" "+soyad);

        String tamIsim=ad+" "+soyad;  //İsmet Temur yazar
        String tamIsim2=ad+soyad; // İsmetTemur yazar
        System.out.println("tamIsim = " + tamIsim);
        System.out.println("tamIsim2 = " + tamIsim2);

        int yas=45;
        int kilo=72;

        String bilgi=ad+" "+soyad+" "+yas+" "+kilo;  // sayılar String le toplanırsa kelime gibi işlem görür
        System.out.println("bilgi = " + bilgi);
    }
}
