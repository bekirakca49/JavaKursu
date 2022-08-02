package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadı ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adı= ");
        String adi=oku.next();

        System.out.print("Soyadi= ");
        String soyadi=oku.next();

        System.out.println("Adi ve Soyadi= "+adi+" "+soyadi);

    }
}
