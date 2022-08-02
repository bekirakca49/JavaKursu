package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen icin not defteri programi yapılmak isteniyor.
        //Her ogrencinin okulNot(int), tamAdi(String) ve notu(int) vardır.
        //Öğretmenden 20 öğrenci için bu bilgileri alınız.
        //bütün sınıfı bir metodda yazdırınız.
        //sınıfın not ortalamasını yine bir metodda yazdırınız.
        ArrayList<Ogrenci> snf=new ArrayList<>();
        
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        Ogrenci ogr = new Ogrenci();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Öğrenci tamAdı=");
            ogr.tamAdi = okuStr.nextLine();
            System.out.print("Öğrenci okulNo=");
            ogr.okulNo = okuInt.nextInt();
            System.out.print("Öğrenci notu=");
            ogr.notu = okuInt.nextInt();
            snf.add(ogr);
        }
        
        bilgiYazdir(snf);
        ortalamaYazdir(snf);
    }
    public static void bilgiYazdir(ArrayList<Ogrenci> snf) {

        int toplam=0;
        for(Ogrenci ogr:snf)
            System.out.println("ogr.tamAdi+\" \"+ogr.notu = " + ogr.tamAdi+" "+ogr.notu);
    }
    public static void ortalamaYazdir(ArrayList<Ogrenci> snf) {

        int toplam=0;
        for(Ogrenci ogr:snf)
            toplam=toplam+ogr.notu;
        System.out.println("toplam/snf.size() = " + toplam/snf.size());
        }
}
