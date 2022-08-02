package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {
        // istenen bir noktadaki karakteri verir.
        // Karakterin sırası  0 (sıfır) dan başlıyor. Bunun özel adı da index dir.
                    // 0123456789012
        String kelime="Merhaba Dünya";
        System.out.println("3.Harf(indexe göre) = " + kelime.charAt(3));

        char ilHarf= kelime.charAt(0);
        System.out.println("ilHarf = " + ilHarf);
    }
}
