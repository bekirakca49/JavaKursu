package Gun08;
import java.util.Scanner;
public class _08_03_Odev {
    public static void main(String[] args) {
        // 3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("üç kelimelik cümle giriniz= ");
        String cumle=oku.nextLine();

        int ilkBoslukIndexi= cumle.indexOf(" ");
        int ikinciBoslukIndexi=cumle.indexOf(" ", ilkBoslukIndexi+1);

        char ilkKelime1Harf=cumle.charAt(0);
        char ikinciKelime1Harf=cumle.charAt(ilkBoslukIndexi+1);
        char ucuncuKelime1Harf=cumle.charAt(ikinciBoslukIndexi+1);

        System.out.println("ilkKelime1Harf = " + ilkKelime1Harf);
        System.out.println("ikinciKelime1Harf = " + ikinciKelime1Harf);
        System.out.println("ucuncuKelime1Harf = " + ucuncuKelime1Harf);
    }
}
