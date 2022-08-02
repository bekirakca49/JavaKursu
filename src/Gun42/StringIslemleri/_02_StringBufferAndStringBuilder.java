package Gun42.StringIslemleri;

import java.util.Arrays;

public class _02_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle=cumle+"Bugün";
        cumle=cumle+"hava";
        cumle=cumle+"çok";
        cumle=cumle+"güzel";

        System.out.println("cumle = " + cumle);
        cumle=cumle.concat("oldu");
        System.out.println("cumle2 = " + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için performası oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı ç alışır.  Fakat paralel çalışan uygulamalarda güvenli değildir.
        // Ozaman StringBuffer kullanılır.

        StringBuilder s=new StringBuilder(); // Buffer da aynı şekilde çalışır. Sadece kontrollü çalışır.
        s.append("Bugün "); // tekrar kendine atama gerektirmez, direk ekleme yapılmış olur.
        s.append("hava ");
        s.append("çok ");
        s.append("güzel");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // eklenen her şeyi string e çevirip ekler.

        s.reverse(); // stringi tersine çevirir.
        System.out.println("s = " + s);
        s.delete(0,5); // 0 dahil 5 hariç indexe göre siler.

        System.out.println("s = " + s);
        s.deleteCharAt(3);// sadece belirtilen index deki karekteri siler.
        System.out.println("s = " + s);

        s.insert(5,"kelime "); // 5 nolu index e (araya)  kelime eklendi.
        System.out.println("s = " + s);

        s.insert(4,5.46);
        System.out.println("s = " + s);

        int [] dizi={1,2,43,56};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);
        
        s=new StringBuilder("Bugün hava sıcak"); // sıfırlandı ve ilk değer atandı.
        System.out.println("s = " + s);

        s.replace(3,8,"bu"); // verilen aralığı verilen ile değiştir.
        System.out.println("s = " + s);

        for (int i: dizi)
            s.append(i); // bu şekilde daha kolay eklenir.

       //  String yeniS=s.toString();
       //  yeniS.replaceAll();
    }
}
