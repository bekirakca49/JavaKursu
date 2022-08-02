package Gun12;
import java.util.Scanner;
public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru: girilen sayı 50 den büyük ise 1, değilse 0 değerini ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz= ");
        int s = oku.nextInt();

        //1. yöntem
        int sonuc=(s>50)? 1:0;
        System.out.println("sonuc = " + sonuc);
        // 2. yöntem
        System.out.println("Sonuç= "+((s>50)?1:0));
    }
}
