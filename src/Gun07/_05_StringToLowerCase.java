package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: string küçük harfe çevirir
        String text="Merhaba Dünya";
        System.out.println("orjinal hali= " + text);
        System.out.println("text.toLowerCase = " + text.toLowerCase()); // merhaba dünya
        System.out.println("text büyük veya küçük harf de olsa me ile başlıyor mu? = " + text.toLowerCase().startsWith("me"));
    }
}
