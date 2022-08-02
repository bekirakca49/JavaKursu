package Gun07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll: replace gibi çalışıyor, farkı kriter(Regex) verilebiliyor
        // regex: regular expression / düzenli ifade demek.
        // TODO: yapılacak demek. regex olarak neler yazılabiliyor google dan araştırılacak.
        String text="Merhaba Dünya";
        System.out.println("orjinal hali= "+text);
        // a,b,n karakterlerini ayrı ayrı bul ve _ ile değiştir
        System.out.println("a,b,n ->_= "+ text.replaceAll("[abn]", "_"));
        System.out.println("a,b,n ->_= "+ text.replaceAll("[A-Z]", "_"));
    }
}
