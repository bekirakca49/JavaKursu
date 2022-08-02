package Gun14;

import java.util.Scanner;

public class _05_1_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayılardan sadece tek olanlarının toplamını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz= ");
        int s= oku.nextInt();
        int t=0;
        int sayac=1;

        while (sayac<=s) {
            t=sayac+2; // toplanacak sayıları sayacak 1,3,5 diye gidecek
            sayac++;
        }
        System.out.println("t = " + t);
        System.out.println("sayac = " + sayac);
    }
}
