package Gun07;

import java.sql.Struct;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace: bir string in içindeki istenen karakter(ler) hepsini verilen yenisi ile değiştirir.
        String text="Merhaba Dünya";
        System.out.println("orjinal hali= "+text);
        System.out.println("a ların e olarak değişmiş hali="+ text.replace("a","e"));
        System.out.println("ba ları -> de= "+ text.replace("ba","de")); // Merhade Dünya
        System.out.println("Dünya -> Java= "+ text.replace("Dünya", "Java")); // Merhaba Java
        System.out.println("a -> sil= "+ text.replace("a", ""));// Merhb Düny
    }
}
