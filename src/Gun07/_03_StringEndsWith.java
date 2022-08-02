package Gun07;

public class _03_StringEndsWith {
    public static void main(String[] args) {
        // endsWith: .... ile bitiyor mu? Sonuç boolean (true, false) döner.
        String text="Merhaba Dünya";
        System.out.println("text.endsWith(\"ya\") = " + text.endsWith("ya")); // true
        System.out.println("text.endsWith(\"a\") = " + text.endsWith("a")); // true
        System.out.println("text.endsWith(\"A\") = " + text.endsWith("A")); // false
        System.out.println("text.endsWith(\"y\") = " + text.endsWith("y")); // false
        System.out.println("text.endsWith(\"ba\") = " + text.endsWith("ba")); // false
    }
}
