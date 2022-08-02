package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı tekrar ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz=");
        String ad=oku.next();  // next()  -> birkelime okumak için

        System.out.println("ad = " + ad);
    }
}
