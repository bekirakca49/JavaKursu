package Gun14;

import java.awt.*;
import java.util.Scanner;

public class _08_02_Odev {
    public static void main(String[] args) {
       //  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz.
        int toplamTek=0;
        int toplamCift=0;
        int sayac=0;
        int sayi=100;

        while (sayac<sayi){
            if (sayac%2==1){
                toplamTek=toplamTek+sayac;}
            if (sayac%2==0){
                toplamCift=toplamCift+sayac;}
            sayac++;
        }
        System.out.println("1-Tek sayıların toplamı= " + toplamTek);
        System.out.println("2-Çift sayıların toplamı= " + toplamCift);
    }
}
