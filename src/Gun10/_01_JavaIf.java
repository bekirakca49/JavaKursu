package Gun10;
import java.util.Scanner;
public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi =if
        // girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük ydiye yazdırınız.
        // Algoritma
        // 1-basla 2-sayı oku 3- sayı>10 ise 10 dan büyük yaz. 4- dur

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz= ");
        int s=oku.nextInt();
        if (s>10)
        { // evet çıkışı
            System.out.println("sayı 10 dan büyüktür ");
        }
       else {System.out.println("sayı 10 dan küçüktür ");
       }
        }
}
