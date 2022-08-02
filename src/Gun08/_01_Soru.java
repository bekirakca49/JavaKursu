package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Ayrı ayrı giriline ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner oku=new Scanner(System.in);
        System.out.print(" Adınızı giriniz= ");
        String adi= oku.nextLine();

        System.out.print(" Soyadınızı giriniz= ");
        String soyadi= oku.nextLine();
        String adsoyad=adi.concat(" ").concat(soyadi);

        System.out.println("Adı ve Soyadı: "+adi.concat(" ").concat(soyadi));
        System.out.println("adsoyad = " + adsoyad);
    }
}
