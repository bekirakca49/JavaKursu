package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array: boyut sayısının belli olduğu durumlardaki veriler için kullanılır.
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor.

        // ArrayList : boyutu dinamik olarak değişebilen, yani eleman eklendikçe  artan, sildikçe azalan Array.

        ArrayList<Integer> integerList=new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

        // String ArrayList tanımlayalım

        ArrayList<String> isimler=new ArrayList<>();
        // eleman ekleme
        isimler.add("Ahmet"); // uzunluğu 1 oldu
        isimler.add("Ayşe"); // uzunluğu 2 oldu
        isimler.add("Kaya"); //
        isimler. add("Hasan");  // hep sonuna ekler.
        System.out.println("isimler = " + isimler); // hızlı yazdırma yöntemi
        System.out.println("isimler.size, yani length() = " + isimler.size()); // dizilerde ki length e karşılık geliyor.

        isimler.add(1,"Zeynep"); // araya ekliyor. arkasındakiler birer kaydı.
        System.out.println("Araya eklendikten sonra isimler = " + isimler);
        isimler.set(1,"Fatih"); // "Zeynep"  ismi "Fatih" ile değiştirildi.
        System.out.println("1 nolu kayıt değiştirilmiş hali isimler = " + isimler);

        int elemanSayisi=isimler.size(); // dizideki eleman sayısını verir.
        System.out.println("elemanSayisi = " + elemanSayisi);

        isimler.remove("Fatih"); // "Fatih" elemanını silecek.
        System.out.println("Fatih elemanını silinmiş hali isimler = " + isimler);
        isimler.remove(1); // 1 nolu indexdeki elemanı silecek.
        System.out.println("1 nolu isim silindikten sonraki isimler = " + isimler);

        int indexOfKaya=isimler.indexOf("Kaya"); // Kaya nın indexini verir
        System.out.println("indexOfKaya = " + indexOfKaya);

        isimler.add("Fatih");
        isimler.add("Ömer");
        System.out.println("isimler = " + isimler);

        isimler.set(0,"Hakan");
        System.out.println("isimler = " + isimler);


        for (int i=0;i<isimler.size();i++)
            System.out.println("isimler elemanları= " + isimler.get(i));// belli bir indexdeki elemanı get ile alıyoruz.
        isimler.clear(); // tüm list boşaltıldı. ilk hale geldi.
        System.out.println("isimler = " + isimler);
    }
}
