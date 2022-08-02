package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        // trim: string in başındaki veya sonundaki boşluk karekterlerini temizler. Trim traş.
        String text="  Merhaba Dünya    ";
        System.out.println("textin orjinal hali ->"+text+">-");
        System.out.println("textin trimmlenmiş hali ->"+text.trim()+">-");
    }
}
