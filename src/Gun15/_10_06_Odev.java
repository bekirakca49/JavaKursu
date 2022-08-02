package Gun15;

import java.util.Scanner;

public class _10_06_Odev {
    public static void main(String[] args) {
        //6-kullanıcının gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int  sayi= oku.nextInt();
        int i;

        for (i=0;sayi>0;i++){
            sayi/=10;
        }
        System.out.println("Toplam karekter sayisi= "+i);
    }
}
