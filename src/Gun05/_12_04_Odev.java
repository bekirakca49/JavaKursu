package Gun05;

import java.util.Scanner;

public class _12_04_Odev {
    public static void main(String[] args) {
        //Bir String oluşturun. Konsola arabanızdaki kapı sayısın giriniz. Bu int i yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("Arabanın kapı sayısını giriniz= ");
        int kapiSayisi=oku.nextInt();

        System.out.println("kapiSayisi = " + kapiSayisi);
    }
}
