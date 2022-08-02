package Gun14;
import java.util.Scanner;
public class _06_01_DoWhile {
    public static void main(String[] args) {
        /// kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.
        // tekrar tekrar okutma satırı yazmamak için. kontrolü sona bırakarak yazmış olduk.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do{
            System.out.print("Sayı giriniz= ");
            sayi=oku.nextInt();
            toplam=toplam+sayi;
        }
        while (sayi!=0);
        System.out.print("toplam = " + toplam);
    }
}
