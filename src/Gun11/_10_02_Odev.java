package Gun11;

import java.util.Scanner;

public class _10_02_Odev {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup olmadığını kontrol ediniz
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s=oku.nextInt();

        int onlar=(s/10)%10;
        int birler=s%10;

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);

        if (birler%2==1 && onlar==birler) {System.out.println("Birler basamağı tek ve onlar basamağına eşittir");}
        else{System.out.println("Girilen sayı koşulları taşımamaktadır");}
        }
    }
