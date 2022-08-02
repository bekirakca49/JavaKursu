package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunuz bulunu

        int[] dizi=new int[7];
        Scanner oku=new Scanner(System.in);

        int i=0;
        int toplam=0;

        for (i = 0; i < dizi.length; i++) {
            System.out.print(i+1+". Sayiyi giriniz= ");
            dizi[i]= oku.nextInt();
            toplam=toplam+dizi[i];
        }
        double ortalama=toplam/(double)dizi.length; // toplam ve dizi int, bu elemanlardan biri double olursa, sonuc double olur.
        System.out.println("ortalama = " + ortalama);

        int adet=0;
        for ( i=0;i<dizi.length;i++) {
            if (dizi[i]>ortalama && dizi[i]%2 == 1) {
                System.out.println("Ortalamadan büyük ve tek sayı = " + dizi[i]);
                adet++;
            }
        }
        System.out.print("Ortalamadan büyük ve tek sayı miktarı= " + adet);
    }
}
