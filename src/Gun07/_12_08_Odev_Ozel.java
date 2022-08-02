package Gun07;

import java.util.Scanner;

public class _12_08_Odev_Ozel {
    public static void main(String[] args) {
        // 2- Girilen bir cumledeki kelimeleri ilk harflerini yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir text giriniz= ");
        String text=oku.nextLine();
        int uzunluk1=text.length();
        String text2=text.replace(" ", "");
        int uzunluk2=text2.length();
        int boslukSayisi=uzunluk1-uzunluk2;
        System.out.println("bosluk sayisi= "+boslukSayisi);

        char ilkharf= text.charAt(0);
        char ikinciHarf=text.charAt(text.indexOf(" ") +1);

        System.out.println("ilkharf = " + ilkharf);
        System.out.println("ikinciHarf = " + ikinciHarf);

    }
}
