package Gun16;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
        // 5. sayı bulmaca oyununu tam hali ile çözünüz.
        Scanner oku=new Scanner(System.in);
        int tutulanSayi=(int)(Math.random()*10);
        int tahmin=0;
        int tahminSayisi=0;
        do{
            System.out.print("Sayı giriniz= ");
            tahmin= oku.nextInt();

            if (tahmin<tutulanSayi)
            System.out.println("Büyük sayı giriniz");
            if (tahmin>tutulanSayi)
            System.out.println("Küçük sayı giriniz");

            if (tahmin==tutulanSayi){
                System.out.println("Bildiniz, tebrikler");
                break;
            }
            if (tahminSayisi==10){
                System.out.println("Tahmin etme hakkınız doldu");
                break;
            }
            tahminSayisi++;
        }while (tutulanSayi!=tahmin);
    }
}
