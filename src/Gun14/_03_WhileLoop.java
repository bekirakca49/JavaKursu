package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 6 sayının toplam sonucunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int sayac=1;

        while (sayac<=6) {
            System.out.print(sayac+".sayıyı giriniz= ");
            int s = oku.nextInt();
            toplam = toplam + s;

            sayac++;
        }
                System.out.println("Toplam= " + toplam);
    }
}
