package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad ve soyadın adını ve soyadını ayırıp, ayrı ayrı yazdırınız
        // ismet temur boşluğun indexini bulup substringle alabiliriz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız= ");
        String adSoyad=oku.nextLine();
        int boslukIndex=adSoyad.indexOf(" ");
        String adi=adSoyad.substring(0,boslukIndex);
        String soyadi=adSoyad.substring(boslukIndex+1);
        System.out.println("adi = " + adi);
        System.out.println("soyadi = " + soyadi);
        System.out.println("boslukIndex = " + boslukIndex);
    }
}
