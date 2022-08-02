package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst : Replace ile aynı, sadece ilk bulunanı değiştirir.

        String text= "Merhaba Dünya";
        System.out.println("orjinal hali= "+text);
        System.out.println("bütün a ları değiştirelim= "+text.replace("a","_")); // Merh_b_ Düny_
        System.out.println("ilk a yı değiştirelim= "+text.replaceFirst("a", "_")); //Merh_ba Dünya
    }
}
