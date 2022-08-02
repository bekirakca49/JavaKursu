package Gun24;

import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");// Bu eklenmez
        renkler.add("RED"); // Bu eklendi. büyük küçük harf farklı algılanır.

        System.out.println("renkler = " + renkler);
        // Ekrana tek tek yazdırma 2. Yöntem
        for (String s : renkler) { // renklerin içindeki elemanlaı herhangi bir sırayla s ismini vererek gönderiyor.
            System.out.println("renkler = " + s);
        }
        // ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim. TreeSet ve LinkedSet

    }
}