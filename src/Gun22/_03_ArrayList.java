package Gun22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        // ArrayList Colletction grubunun bir elemanı
        // Array i srılatırken Arrays.sort u kulladığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(45);
        rakamlar.add(1);
        rakamlar.add(90);
        rakamlar.add(75);
        rakamlar.add(35);
        rakamlar.add(85);

        System.out.println("rakamlar ilk hali = " + rakamlar);

        Collections.sort(rakamlar); // küçükten büyüğe sıralar
        System.out.println("rakamlar son hali = " + rakamlar);

        Collections.reverse(rakamlar); // tersine çevirir
        System.out.println("rakamlar reverse hali ile = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0); // bütün elemanlara verilen değeri atar
        System.out.println("fill (0) = " + rakamlar);

        Collections.replaceAll(rakamlar,0,2); // 0 ları 2 ile değiştirir
        System.out.println("replaceAll(rakamlar,0,2) = " + rakamlar);
    }
}
