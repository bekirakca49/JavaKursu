package Gun05;

import java.util.Scanner;

public class _12_06_Odev {
    public static void main(String[] args) {
        // Bir string oluştur. Konsola 10 sene önceki yaşadığın şehri yazın.  Bu String i yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("10 yıl önce yaşadığınız şehri giriniz= ");
        String sehir= oku.nextLine();

        System.out.println("10 yıl önce yaşadığım şehir = " + sehir);
    }
}
