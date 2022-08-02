package Gun10;

import java.util.Scanner;

public class _09_03_Odev {
    public static void main(String[] args) {
        //girilen bir kelimenin lik ve son harfinin aynı olup oldağını yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz= ");
        String kelime=oku.next().toLowerCase();
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt(kelime.length()-1);

        System.out.println("İlk harf= "+ilkHarf);
        System.out.println("Son harf= "+sonHarf);

        if (ilkHarf==sonHarf){System.out.println("Bu kelimenin lik ve son harfi aynıdır");}
        else {System.out.println("Bu kelimenin lik ve son harfi farklıdır");
        }

    }
}
