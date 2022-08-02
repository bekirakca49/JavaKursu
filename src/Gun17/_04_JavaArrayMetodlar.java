package Gun17;
import java.lang.reflect.Array;
import java.util.Arrays;
public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi) -> diziyi string olarak direk yazdırır
        
        String [] isimler={"ahmet","melike","sümeyra","mert","inanç",};
        System.out.println("Arrays.toString(isimler)"+Arrays.toString(isimler));
        
        //Arrays.sort(isimler) -> diziyi sıralar
        Arrays.sort(isimler); // dizinin elemanlarını sıralar
        System.out.println("Sıralı Hali Arrays.toString(isimler)"+Arrays.toString(isimler));
        
        // Diziler eşit mi?  Arrays.equals(dizi1,dizi2)
        int [] a={1,8,3,54};
        int [] b={1,8,3,54};
        int [] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,c));
        
        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        
        // Arrays.fill -> bütün kutucuklara 7 atar;
        Arrays.fill(c,7);
        System.out.println("Fill == Arrays.toString(c) = " + Arrays.toString(c));

        // dizinin içinde eleman bulma // sıralı değilse bulamaz
        // aranan eleman binden fazla ise herhangi birini verebilir.
        // - sayı çıkarsa eleman mevcut değil demek
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise nefatif sayı döndürür.

        int [] rakamlar={2,7,9,8,1,8,3,54};
        System.out.println("Arrays.binarySearch(a,5) = " + Arrays.binarySearch(rakamlar,8));

        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(a,5) = " + Arrays.binarySearch(rakamlar,8));
    }

}
