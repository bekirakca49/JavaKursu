package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase string i büyük harfe çevirir.
        String text="Merhaba Dünya";
        System.out.println("Orjinal hali = " + text); // Merhaba Dünya
        System.out.println("Büyük hali= "+text.toUpperCase()); // MERHABA DÜNYA

        // büyek veya küçük harf farketmeksizin ya ile bitiyor mu?
        System.out.println("sonuç= "+text.toUpperCase().endsWith("YA"));// true
    }
}
