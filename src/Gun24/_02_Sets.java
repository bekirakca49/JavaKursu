package Gun24;

import java.util.*;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS: HashSet(hızlı), LinkedHashSet(ekleme sırasına göre), TreeSet(her zaman sıralı)
        // Hızlı çalışmak için keni özel algoritma sırasına göre saklar
        HashSet hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");

        System.out.println("hs = " + hs);

        // LinkedHashSet: eklenme sırasına göre tutar
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        // alfabetik sıralı
        TreeSet<String> ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths = " + ths);

        // alfabetik sıralı
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(4);
        ts.add(2);
        ts.add(5);
        System.out.println("ths2 = " + ts); // ths2= [bes, bir, dört, iki, üç]

        for (Integer s3:ts)// sırayı garanti etmiyor
        {
            System.out.println("s = " + s3);
        }

        Iterator gosterge=ts.iterator(); //indexini n yaptığını yapıyor.
        while (gosterge.hasNext());  // setlerde  kendi içindeki sırasına göre elemanlara ulaşmak için.
        {
            System.out.println("gosterge = " + gosterge);
        }

    }
}