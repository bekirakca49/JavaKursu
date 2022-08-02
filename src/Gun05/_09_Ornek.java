package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan usurname ve şifresinin girişini sağlatınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Usurname=");
        String usurname=oku.next();

        System.out.print("Şifre=");
        String sifre=oku.next();

        System.out.println("usurname = " + usurname);
        System.out.println("sifre = " + sifre);

        System.out.println("Giriş başarılı" );

    }
}
