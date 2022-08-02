package Gun04;

public class _00_Giris {
    public static void main(String[] args) {
            byte ogr1Note=90;
            int notToplam=ogr1Note; // byte türünü int atamış olduk.
            //ogr1Note=notToplam olarak yapılamaz küçük büyüğü dönüştürülemez.
            ogr1Note=(byte) notToplam; // int türünü byte türüne dönüştürürken, bunu bilerek yaptığımızı belirtmeliyiz.
            //bunu da atanan değişkenin başına değişkenin türü parantez içinde yazılır.

        }
    }
