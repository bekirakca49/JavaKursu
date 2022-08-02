package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen en az 3 kelimelik cümledeki ilk iki kelimeyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümleyi giriniz = ");
        String cumle=oku.nextLine();

        int birinciboslukIndexi=cumle.indexOf(" ");
        int ikinciciboslukIndexi=cumle.indexOf(" ",birinciboslukIndexi+1);
        // koşul ara ama benim verdiğim indexten sonra

        String ilk2kelime=cumle.substring(0,ikinciciboslukIndexi);
        System.out.println("ilk2kelime = " + ilk2kelime);
    }
}
