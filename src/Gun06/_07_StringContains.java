package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir stringin içinde karekter(lerin) var olup olmadığını söyler
        // boolean cinsinden true veya false döndürür

        String kelime="Merhaba Dünya";
        boolean varMi=kelime.contains("a");

        System.out.println("varMi = " + varMi);
        System.out.println("varMİ="+ kelime.contains("f"));
        System.out.println("varMi="+ kelime.contains("ya"));
        System.out.println("varMi="+kelime.contains("Dünya"));
    }
}
