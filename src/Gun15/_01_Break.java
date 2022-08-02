package Gun15;
import java.util.Scanner;
class _01_Break {
    public static void main(String[] args) {
        //  girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.
        // 16  4x4, 9 3x3, 6 böyle bir sayı değildir.
        // 16 girildiğinde 1....16 kadar sayılardan 1 si olabilir kendiyle çarpıldığında 16 veren.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi = oku.nextInt();
        int sayac = 1;
        int arananSayi = 0;

        while (sayac <=sayi) {
            if (sayac * sayac == sayi) {
                arananSayi = sayac;
                break;
            }
            sayac++;
        }
        if (arananSayi>0) // aranan sayıya bir değer atanmış mı? yani bulundu mu
            System.out.println("tam kraredir, sayi= "+arananSayi);
        else
            System.out.println("Bu sayı tam kare değildir.");
    }
}