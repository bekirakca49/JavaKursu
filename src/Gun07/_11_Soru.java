package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //Grilen bir string teki nokta sayısı bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen bir text giriniz= ");

        String text=oku.nextLine();
        int uzunluk1=text.length();

        String noktasiz=text.replace(".", (""));// noktalar yok edildi.
        System.out.println("noktasiz = " + noktasiz);

        int uzunluk2=noktasiz.length();

        System.out.println("nokta sayisi = " + (uzunluk1-uzunluk2));
    }
}
