package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadın "Ismet Temur" I.T. şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad ve soyad giriniz= ");
        String tamAd=oku.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf(" ");
        char soyadIlkharf=tamAd.charAt(boslukIndex+1);

        System.out.println("Şifreli Ad= "+ilkHarf+". "+soyadIlkharf+".");

    }
}
