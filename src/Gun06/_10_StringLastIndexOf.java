package Gun06;

import java.rmi.StubNotFoundException;

public class _10_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf gibi çalışır, ama sondan itibaren indexi verir.
        String s1="Merhaba";
        System.out.println("Bastan a nın indexi= "+s1.indexOf("a"));
        System.out.println("sondan a nın indexi= "+s1.lastIndexOf("a"));

        // sondan başlayarak bak
        // index har zaman soldan sayılarak 0 dan başlar. Sadece arama başlama yönü değişiyor.
        // index her zaman tektir.
    }
}
