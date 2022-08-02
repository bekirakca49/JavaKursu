package Gun10;

import java.util.Scanner;

public class _09_02_Odev {
    public static void main(String[] args) {
        //Girilen bir şifrenin Bayrak kelimesine eşit olup olmadığnı yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir şifre giriniz= ");
        String sifre= oku.nextLine();

        if (sifre.contains("Bayrak")){System.out.println("Şifre bayrak kelimesini içermektedir");}
        else {
            System.out.println("Şifre Bayrak kelimesini içermemektedir");
        }
    }
}
