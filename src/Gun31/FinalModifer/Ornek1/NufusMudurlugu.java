package Gun31.FinalModifer.Ornek1;

public class NufusMudurlugu {
    public static void main(String[] args) {
        // Vatandas isimli bir Class tanmlayınız (fields: isim, tcNo)
        // tcNo değerini int olarak alınız ve nesne oluşturulurken
        // sıralı olarak atayınız. Daha sonradan değeri değiştirilemesin.
        // kontrol için mainde 2 kişi tanımlayınız.

        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Mehmet");

        //final değişkenlerine sadece 1 kez veri atanabilir.
        // a da ya tanımlanırken, ya da Constructor da.

        final double pi=3.14; // tanımlanırken. tanımlama burda yada Constructur da yapılabilir.
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

    }
}
