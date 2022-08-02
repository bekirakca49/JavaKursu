package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir string in sadece son harfini yazdırınız.
        // merhaba  -> lengt: 6
        //yani Lengt -1 i bana son harfin index ini verir

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string değer giriniz= ");
        String girilen=oku.nextLine();

        int uzunluk=girilen.length();
        char sonHarf=girilen.charAt(uzunluk-1); // toplam karakter sayısı okudundu.
        // Fakat charAt indexe göre çalıştığından 1 eksiği alındı.

        System.out.println("Son harf = "+sonHarf);
        System.out.println("Son harf = "+girilen.charAt(girilen.length()-1));
    }
}
