package Gun06;

import java.util.Scanner;

public class _12_10_ODEV {
    public static void main(String[] args) {
        // 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Ad ve soyad giriniz= ");
        String tamAd=oku.nextLine();
        // Ahmet Yılmaz Temiz
        // a-> 0, y->1.boşluk+1, T-> last Index bosluk+1 ile çözülür.

        char ilkHarf=tamAd.charAt(0);

        int boslukIndex1=tamAd.indexOf(" ");
        char ikinciHarf=tamAd.charAt(boslukIndex1+1);

        int boslukIndex2=tamAd.lastIndexOf(" ");
        char soyadIlkharf=tamAd.charAt(boslukIndex2+1);

        System.out.println("Şifreli Ad= "+ilkHarf+". "+ikinciHarf +". "+soyadIlkharf+".");
    }
}
