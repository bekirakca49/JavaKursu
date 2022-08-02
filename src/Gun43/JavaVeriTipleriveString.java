package Gun43;

public class JavaVeriTipleriveString {
    public static void main(String[] args) {
        int sayi=5; // short, byte, int, long, float, double, char, boolean  primitive(basit) tipler
        Integer rakam=5; // nesne veri tipleri class ı var. önerilmiyor. hafızada fazla yer kaplıyor.
        rakam.toString(); // stringe çeviriyor. kendine ait hazır fonksiyonları var.
        String.valueOf(sayi); // String e çeviriyor.


        // Referans tipler
        int[] dizi1={1,2,3};
        int[] dizi2={4,5};

        dizi1=dizi2;

        dizi2[0]=56;

        System.out.println("dizi1 = " + dizi1[0]);
        System.out.println("dizi2 = " + dizi2[0]);

        dizi1[0]=86;

        System.out.println("dizi1 = " + dizi1[0]);
        System.out.println("dizi2 = " + dizi2[0]);

        // String tiplerin durumu farklı: referans bir tiptir
        // davranışı primitive fakat kategorisi  Referans'dır.
        String isim="Bekir";
        String ad="Mehmet";

        isim=ad;
        isim="ali"; // yeni oluşturduğu için her zaman farklı oluyor. bu nedenle hiçbir zaman adresleri farklı oluyor.
        // yeni oluşturulmuş gibi çalışıyor.

        System.out.println("ad = " + ad);
        System.out.println("isim = " + isim);

        ad=ad.replace("e","a");
        ad="mahmet"; // yeniden oluşturma yapıyor.
        //çünkü eski değerde değişiklik yapamıyor.

        String isim2; // adı var ama hafızada yeri yok, evi yok ki adresi olsun.

        // equals ile  == arasındaki fark nedir?

    }
}
