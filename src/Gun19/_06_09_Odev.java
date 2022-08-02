package Gun19;

import java.util.Scanner;

public class _06_09_Odev {
    public static void main(String[] args) {
        //9- Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında Random int tipinde bir sayı
        //üreten programı yazınız.
        //not : girilen sayı üretilen sayılara dahil olmalı

        Scanner oku=new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz= ");
        int sayi= oku.nextInt();
        int sayi2=0;
        int i=0;

        for (i=0;i<=sayi;i++){
            sayi2=(int)(Math.random()*sayi);
            System.out.println(i+".Sayı= "+sayi2);
        }
    }
}
