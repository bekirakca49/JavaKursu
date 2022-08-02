package Gun05;

import java.util.Scanner;

public class _12_02_Odev {
    public static void main(String[] args) {
        // Bir int oluşturun. Konsola herhangi bir sayı giriniz. Bu sayıyı yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi=oku.nextInt();

        System.out.println("sayi = " + sayi);
    }
}
