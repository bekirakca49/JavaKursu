package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _06_10_Odev {
    public static void main(String[] args) {
        //10- Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);

        int [] dizi=new int[2];
        int [] dizi2=new int[10];

        for (int i=0;i<2;i++){
            System.out.print((i+1)+".Sayıyı giriniz= ");
            dizi[i]= oku.nextInt();
        }
        Arrays.sort(dizi);
        int aralik=(dizi[1]-dizi[0]);
        int min=dizi[0];
        System.out.println("dizi = " + Arrays.toString(dizi));

        for (int i=0;i<aralik;i++){
            dizi2[i]=((int)(Math.random()*min)+aralik);
        }
        System.out.println("dizi = " + Arrays.toString(dizi2));
        }
}
