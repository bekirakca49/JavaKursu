package Gun09;

import java.util.Scanner;

public class _09_11_Odev {
    public static void main(String[] args) {
        // 1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        // 2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int s1= oku.nextInt();
        int birlerBasamagi=s1%10;
        int onlarBasamagi=(s1/10)%10;
        int yuzlerBasamagi=(s1/100)%10;
        int binlerBasamagi=(s1/1000)%10;

        System.out.println("binlerBasamagi = " + binlerBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("birlerBasamagi = " + birlerBasamagi);

    }
}
