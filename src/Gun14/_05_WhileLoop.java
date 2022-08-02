package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayılardan sadece tek olanlarının toplamını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz= ");
        int s= oku.nextInt();
        int t=0;
        int sayac=1;

        while (sayac<=s) {
            if (sayac%2==1)
                t=t+sayac;
                sayac++;
            }
            System.out.println("t = " + t);

        //2. yöntem
        sayac=1;
        t=0;
        while (sayac<=s) {
                t=t+sayac; // toplanacak sayıları sayacak 1,3,5 diye gidecek.
            sayac=sayac+2;
        }
        System.out.println("ttt = " + t);

    }
}
