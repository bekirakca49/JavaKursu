package Gun08;

import java.util.Scanner;

public class _08_05_Odev {
    public static void main(String[] args) {
       // Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567
        Scanner oku=new Scanner(System.in);
        System.out.print("kredi kartı numaranızı giriniz = ");
        String kartNumarasi=oku.nextLine();

        String kartParca=kartNumarasi.substring(0,kartNumarasi.length()-4);
        String  kartParcaSil=kartParca.replaceAll("[0-9]","*");
        String kartSon4Rakam=kartNumarasi.substring(kartNumarasi.length()-4,kartNumarasi.length());
        System.out.println("kartSon4Rakam = " + kartSon4Rakam);
        System.out.println("kartParcaSil = " + kartParcaSil);
        System.out.println("Kart Numarası: "+(kartParcaSil+kartSon4Rakam) );
    }

}
