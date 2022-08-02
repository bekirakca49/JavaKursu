package Gun08;

import java.util.Scanner;
import java.util.SortedMap;

public class _08_02_Odev {
    public static void main(String[] args) {
        //Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("üç kelimelik cümle giriniz = ");
        String cumle=oku.nextLine();

        int ilkBoslukIndex=cumle.indexOf(" ");
        int ikinciBoslukIndex= cumle.indexOf(" ",ilkBoslukIndex+1);
        String ilkKelime=cumle.substring(0, ilkBoslukIndex);
        String ikinciKelime=cumle.substring(ilkBoslukIndex+1,ikinciBoslukIndex);
        String ucuncuKelime=cumle.substring(ikinciBoslukIndex+1);

        System.out.println("ilkcumle =" + ilkKelime);
        System.out.println("ikincicumle =" + ikinciKelime);
        System.out.println("ucuncukelime =" + ucuncuKelime);

    }
}
