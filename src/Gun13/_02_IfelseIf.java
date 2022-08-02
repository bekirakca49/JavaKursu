package Gun13;

import java.util.Scanner;

public class _02_IfelseIf {
    public static void main(String[] args) {
        // girilen 2 tam sayıyı kullanıcıdan aldıktan sonra
        // toplama için T, çıkarma için Ç, çarpma için P, bölme için B
        // harflereni alarak isteğe uygun olan işlemi yaptırıp sonuducu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Tam sayı giriniz= ");
        int tamSayi1= oku.nextInt();
        System.out.print("2. Tam sayı giriniz= ");
        int tamSayi2= oku.nextInt();

        System.out.print("Yapılacak işlemi yazın= toplama için T, çıkarma için Ç, çarpma için P, bölme için B=");
        Scanner okuStr=new Scanner(System.in);
        String islem= okuStr.next();

        int toplama=(tamSayi1+tamSayi2);
        int capma=(tamSayi1*tamSayi2);
        int bolme=(tamSayi1/tamSayi2);


        if (islem.equalsIgnoreCase("T")){System.out.println("Toplama = " + toplama);}
        else if (islem.equalsIgnoreCase("Ç")) {System.out.println("Çarpma sonucu= "+capma);}
        else if (islem.equalsIgnoreCase("B")) {System.out.println("Bölme sonucu= "+capma);}
        else System.out.println("Hatalı seçim yaptınız");
    }
}
