package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çif ise bir stringe çift atayınız,
        // tek ise tek atayınız ve ekrana stringi yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz= ");
        int s = oku.nextInt();

        // klasik yöntem
        if (s%2==1) System.out.println("Tek");
        else System.out.println("Çift");

        // tek satırda yazma yöntemi: Ternary
        String sonuc=(s%2==1)?"Tek":"Çift";
        System.out.println("Sonuç= "+sonuc);
        //şart doğru ise ilk bölüm değil se son bölüm çalışır.
        System.out.println((s%2==1)?"Tek":"Çift");

    }
}
