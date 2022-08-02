package Gun26._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt proğramı icin Ogrenci bilgilerini alan modül yazılacaktır.
        // Ogrenci ye ait bilgiler (adi,sinifi ve adres) vardır.
        // Kullanıcıdan 3 adet öğrenci bilgileri alarak oldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.
        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Öğrenci adı=");
            ogr.adi = oku.nextLine();
            System.out.print("Öğrenci soyadı=");
            ogr.soyadi = oku.nextLine();
            System.out.print("Öğrenci sinifi=");
            ogr.sinif = okuInt.nextInt();
            System.out.print("Öğrenci adresi=");
            ogr.adres = oku.nextLine();

            snf.add(ogr);

        }
        for (Ogrenci ogr : snf) {
            System.out.println("ogr adi = " + ogr.adi);
            System.out.println("ogr soyadi = " + ogr.soyadi);
            System.out.println("ogr sinifi = " + ogr.sinif);
            System.out.println("ogr.adresi = " + ogr.adres);
        }
    }
}
