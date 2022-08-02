package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _06_08_Odev {
    public static void main(String[] args) {
        //8- Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
        //Example 1:
        //int input = 10;
        //print 0 2 4 6 8 10 olmalı
        //Example 2:
        //int input = 15;
        //print 0 2 4 6 8 10 12 14 olmalı
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi=oku.nextInt();
        int i=1;

        int cifIndex=0;
        int[] ciftler=new int[10];

        for (i=0;i<=sayi;i++){
            if (i%2==0) {
                ciftler[cifIndex]=i;
                cifIndex++;
            }
        }

        System.out.println("i = "+ i);
        System.out.println("ciftIndex = "+ cifIndex);
        System.out.println("Dizi= "+ Arrays.toString(ciftler));
    }
}
