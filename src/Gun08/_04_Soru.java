package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen bir password un sizin bildiğiniz bir kelimeyle eş olup olmadığını bulunuz.
        // şifre="bayrak"

        Scanner oku=new Scanner(System.in);
        System.out.print("Passwordu giriniz");
        String girilenSifre=oku.nextLine();

        String gizliSifre="bayrak";
        System.out.println("gizliSifre.equals(girilenSifre) = " + gizliSifre.equals(girilenSifre));
        System.out.println("gizliSifre.equals(girilenSifre) = " + girilenSifre.equals(gizliSifre));
        System.out.println("gizliSifre.equals(girilenSifre) = " + gizliSifre.equalsIgnoreCase(girilenSifre));
        //büyük küçük harf ayırmadan karşılaştırır.
    }
}
