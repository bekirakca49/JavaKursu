package Gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        // Değişkenler
        int sayi;  // int : int miktarında alan kaplayan tam sayı tipi
        int Sayi;  // bu farklı değişkendir bir haf bile büyük, küçük olsa farklı olur.
        sayi=5; // bu satırda sayının değeri 5
        System.out.println("sayi"); // kelime olarak sayı yazar
        System.out.println(sayi); // bu durumda değişkenin değerini yazar
        System.out.print("Sayi="); // kelime olarak sayı
        System.out.println(sayi); // rakam olarak sayi
        System.out.println("Sayi="+ sayi); // bu ikisini birlikte yazar
        sayi=7; // burda sayının değeri 7
        int kisakenar=5;
        int uzunkenar=7;
        int cevre=5+5+7+7;
        System.out.println("Çevresi="+cevre);

        kisakenar=sayi;   //sayinin degeri kisa kenara atandı KisaKenar=7
        cevre =(kisakenar+uzunkenar)*2;
        System.out.println("cevre="+cevre);

    }
}
